/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
class DoublyLinkedList {
   Nodo cabeza;
    private Nodo cola;
    private int tamaño;

    String obtener(int i) {
        throw new UnsupportedOperationException("No soportado aún.");
    }

    String get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private class Nodo {
        private String datos;
        private Nodo anterior;
        private Nodo siguiente;

        public Nodo(String datos) {
            this.datos = datos;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    public void insertarUltimo(String datos) {
        Nodo nuevoNodo = new Nodo(datos);

        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }

        tamaño++;
    }

    public void mostrarAdelante() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println(actual.datos);
            actual = actual.siguiente;
        }
    }

    public void mostrarAtras() {
        Nodo actual = cola;

        while (actual != null) {
            System.out.println(actual.datos);
            actual = actual.anterior;
        }
    }

    public int obtenerTamaño() {
        return tamaño;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }
}