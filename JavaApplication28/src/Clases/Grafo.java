/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HiYeaismin 8a
 */
public class Grafo {

    NodoGrafo ini, fin;

    public Grafo() {
        ini = fin = null;
    }

    public boolean insertarNodo(char valor) {
        NodoGrafo nuevo = new NodoGrafo(valor);
        if (nuevo == null) {
            return false;
        }
        if (ini == null && fin == null) {
            ini = fin = nuevo;
            return true;
        }
        fin.sig = nuevo;
        nuevo.ant = fin;
        fin = nuevo;
        return true;
    }

    public boolean insertarArista(char orig, char dest) {
        NodoGrafo origen = buscarNodoGrafo(orig);
        if (origen == null) {
            return false;
        }
        NodoGrafo destino = buscarNodoGrafo(dest);
        if (destino == null) {
            return false;
        }
        NodoArista temp = new NodoArista(destino);
        if (temp == null) {
            return false;
        }

        if (origen.arista == null) {
            origen.arista = temp;
            return true;

        }
        NodoArista t2 = origen.arista;
        while (t2.sig != null) {
            t2 = t2.sig;
        }
        t2.sig = temp;
        temp.ant = t2;
        mostrar(temp.direccion);

        return true;
    }

    public NodoGrafo buscarNodoGrafo(char valorBuscado) {
        if (ini == null) {
            return null;
        }

        NodoGrafo temp = ini;
        do {
            if (temp.valor == valorBuscado) {

                return temp;

            }
            temp = temp.sig;
        } while (temp != null);
        return null;
    }

    public boolean eliminarArista(char orig, char dest) {
        NodoGrafo origen = buscarNodoGrafo(orig);
        if (origen == null) {
            return false;
        }

        if (origen.arista == null) {
            return false;
        }

        NodoArista temp = origen.arista;
        do {
            if (temp.direccion.valor == dest) {
                if (temp == origen.arista) {
                    //Arista a ELIMINAR como primer Nodo
                    origen.arista = temp.sig;
                    temp.direccion = null;
                    temp.sig = null;
                    origen.arista.ant = null;
                    return true;
                } else {
                    //Arista a ELIMINAR como ULTIMO nodo
                    if (temp.sig == null) {
                        temp.ant.sig = null;
                        temp.direccion = null;
                        temp.ant = null;
                        return true;
                    }
                    //desconectar la arista a eliminar estando en medio;
                    temp.ant.sig = temp.sig;//puntero SIG de nodo ARRIBA (temp.ant) lo enlazo con nodoAbajo (temp.sig);
                    temp.sig.ant = temp.ant; // puntero ant de ABAJO(temp.sig) lo enlazo con NODOARRIBA (temp.ant)
                    temp.sig = temp.ant = null;
                    temp.direccion = null;
                    return true;
                }

            }
            temp = temp.sig;
        } while (temp != null);
        return false;
    }

    public boolean eliminarNodo(char valor) {
        if (ini == null && fin == null) {
            return false;
        }
        NodoGrafo nodoAEliminar = buscarNodoGrafo(valor);
        if (nodoAEliminar == null) {
            return false;
        }

        //veficar si es isla el nodo a eliminar
        //caso 1 (que el nodo no tenga aristas)
        if (nodoAEliminar.arista != null) {
            //no se puede eliminar teniendo aristas.
            return false;
        }
        //caso 2
        //si otro nodo tiene aluna arista apuntando A él
        for (NodoGrafo temp = ini; temp != null; temp = temp.sig) {
            if (encontrarAristas(temp, nodoAEliminar) == true) {
                return false;

            }

        }
        if (ini == fin && ini == nodoAEliminar) {
            ini = fin = null;
            return true;
        }
        //Eliminando 
        if (ini == nodoAEliminar) {
            NodoGrafo temp = ini.sig;
            temp.ant = null;
            ini = temp;
            return true;
        }

        //Eliminando si el noEliminar está en fin
        if (fin == nodoAEliminar) {
            NodoGrafo temp = fin.ant;
            temp.sig = null;
            fin.ant = null;
            fin = temp;
            return true;
        }
        //desenlace del anterior y siguiente.
        nodoAEliminar.ant.sig = nodoAEliminar.sig;
        nodoAEliminar.sig.ant = nodoAEliminar.ant;
        nodoAEliminar.sig = nodoAEliminar.ant = null;
        return true;
    }

    public boolean encontrarAristas(NodoGrafo temp, NodoGrafo nodoAEliminar) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (NodoArista temp2 = temp.arista;
                temp2 != null;
                temp2 = temp2.sig) {

            if (temp2.direccion == nodoAEliminar) {
                return true;

            }

        }
        return false;
    }

    public String mostrar(NodoGrafo temp) {
        if (temp == null) {
            return "";
        }
        return temp.valor + "," + mostrar(temp.sig);
    }

    public String mostrar() {
        if (ini == null && fin == null) {
            return "La lista está vacía";
        }
        return mostrar(ini);
    }

    public String mostrarLaArista(char cajaDeTexto) {
        NodoGrafo nodoTemporal = buscarNodoGrafo(cajaDeTexto);
        String cadena = "";
        if (nodoTemporal == null) {
            return "no existe";
        }
        System.out.println("1");
        if (nodoTemporal.arista == null) {
            cadena += nodoTemporal.valor + " No tiene aristas";
            return cadena;
        }
        System.out.println("2");
        if (nodoTemporal.arista.sig == null) {
            cadena += nodoTemporal.valor + "-->" + nodoTemporal.arista.direccion.valor + "";
            return cadena;
        }
        System.out.println("3");
        cadena += nodoTemporal.valor + "\n->";
        for (NodoArista temp = nodoTemporal.arista; temp != null;
                temp = temp.sig) {
            cadena += temp.direccion.valor + "-";         
        }
         System.out.println("4");
        return cadena;
    }
}
