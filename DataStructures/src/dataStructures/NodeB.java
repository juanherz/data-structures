/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures;

/**
 *
 * @author juanh
 * clase nodo para arbol binario normal, solo usa enteros
 */
public class NodeB {
    public int dato;
    public NodeB izq, der;
    
    public NodeB(int dato) {
        this.dato = dato;
        izq = der = null;
    }

    public int getDato() {
        return dato;
    }
    
    @Override
    public String toString() {
        return dato + "";
    }
    
    
}
