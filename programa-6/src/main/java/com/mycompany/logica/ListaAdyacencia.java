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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ListaAdyacencia implements Serializable {
    private HashMap<String, Nodo> grafo;  // Usamos un HashMap para representar el grafo
    private List<Nodo> nodos = new ArrayList<>();

    private static final long serialVersionUID = 1L;

    public ListaAdyacencia() {
        grafo = new HashMap<>();
    }

    public void agregarNodo(String nombre, Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        grafo.put(nombre, nuevoNodo);
        nodos.add(nuevoNodo);  // Agregar el nodo también a la lista de nodos
    }

    public void agregarAdyacencia(String origen, String destino) {
        Nodo nodoOrigen = grafo.get(origen);
        Nodo nodoDestino = grafo.get(destino);

        if (nodoOrigen != null && nodoDestino != null) {
            nodoOrigen.adyacentes.add(nodoDestino);
            // Si el grafo es no dirigido, descomenta la siguiente línea
            // nodoDestino.adyacentes.add(nodoOrigen);
        } else {
            System.out.println("Uno o ambos nodos no existen.");
        }
    }

    public Nodo buscarSecuencial(String nombre) {
        return grafo.get(nombre);
    }

public String mostrarElementosPorClaseYLinea(String tipoTransporte, int lineaSeleccionada) {
    StringBuilder resultado = new StringBuilder(); // Usamos StringBuilder para concatenar de manera eficiente
    for (Nodo nodo : nodos) {
        if (nodo.dato instanceof Tren && tipoTransporte.equals("Tren")) {
            Tren tren = (Tren) nodo.dato;
            if (tren.getLineaTren() == lineaSeleccionada) {
                resultado.append(mostrarNodoYAdyacentes(nodo)); // Concatenamos el resultado del nodo y sus adyacentes
            }
        } else if (nodo.dato instanceof Micro && tipoTransporte.equals("Micro")) {
            Micro micro = (Micro) nodo.dato;
            if (micro.getLineaMicro() == lineaSeleccionada) {
                resultado.append(mostrarNodoYAdyacentes(nodo)); // Concatenamos el resultado del nodo y sus adyacentes
            }
        }
    }
    return resultado.toString(); // Devolvemos el resultado como String
}
 private String mostrarNodoYAdyacentes(Nodo nodo) {
    StringBuilder resultado = new StringBuilder(); // Usamos StringBuilder para concatenar de manera eficiente

    if (nodo.dato instanceof Tren) {
        Tren tren = (Tren) nodo.dato;
        resultado.append("\tTren\nNombre: " + tren.getNombre() +
                "\nLínea: " + tren.getLineaTren() +
                "\nCalle: " + tren.getNombreCalle() +
                "\nHora de apertura: " + tren.getHoraInicio() + " AM" +
                "\nHora de cierre: " + tren.getHoraCierre() + " PM" +
                "\nTrasborda: " + tren.getTrasbordar() + "\n");
    } else if (nodo.dato instanceof Micro) {
        Micro micro = (Micro) nodo.dato;
        resultado.append("\tMicro\nNombre: " + micro.getNombre() +
                "\nLínea: " + micro.getLineaMicro() +
                "\nCalle: " + micro.getNombreCalle() +
                "\nHora de apertura: " + micro.getHoraInicio() + " AM" +
                "\nHora de cierre: " + micro.getHoraCierre() + " PM" +
                "\nTrasborda: " + micro.getTrasbordar() + "\n");
    }

    // Mostrar estaciones adyacentes
    if (!nodo.adyacentes.isEmpty()) {
        resultado.append("Estaciones adyacentes:\n");
        for (Nodo adyacente : nodo.adyacentes) {
            if (adyacente.dato instanceof Tren) {
                Tren trenAdyacente = (Tren) adyacente.dato;
                resultado.append("\t- Tren: " + trenAdyacente.getNombre() + "\n");
            } else if (adyacente.dato instanceof Micro) {
                Micro microAdyacente = (Micro) adyacente.dato;
                resultado.append("\t- Micro: " + microAdyacente.getNombre() + "\n");
            }
        }
    }
    resultado.append("\n"); // Añadir un salto de línea al final
    return resultado.toString(); // Devolver el resultado como String
}


    // Clase Nodo
    private class Nodo implements Serializable {
        Object dato;
        List<Nodo> adyacentes;

        public Nodo(Object dato) {
            this.dato = dato;
            this.adyacentes = new ArrayList<>();
        }
    }
}
