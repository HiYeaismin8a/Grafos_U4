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
public class NodoGrafo {

    public NodoGrafo sig, ant;
    public char valor;
    public NodoArista arista;

   public NodoGrafo(char v) {
        ant = sig = null;
        valor = v;
        arista = null;
    }



    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

 
 

}
