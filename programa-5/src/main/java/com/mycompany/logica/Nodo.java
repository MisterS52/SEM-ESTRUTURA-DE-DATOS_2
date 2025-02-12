/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logica;

/**
 *
 * @author JOVANNI SG
 */
import java.io.Serializable;

public class Nodo implements Serializable {
	Object dato;
    Nodo siguiente;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    

}
