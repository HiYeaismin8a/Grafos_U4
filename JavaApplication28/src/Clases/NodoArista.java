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
public class NodoArista {

    NodoArista sig, ant;
    NodoGrafo direccion;

    public NodoArista(NodoGrafo d) {
        direccion = d;
        ant = sig = null;
    }

    public NodoGrafo getDireccion() {
        return direccion;
    }

    public void setDireccion(NodoGrafo direccion) {
        this.direccion = direccion;
    }

   
}
