package transporte;

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

    public void mostrarElementosPorClaseYLinea(String tipoTransporte, int lineaSeleccionada) {
        for (Nodo nodo : nodos) {
            if (nodo.dato instanceof Tren && tipoTransporte.equals("Tren")) {
                Tren tren = (Tren) nodo.dato;
                if (tren.getLineaTren() == lineaSeleccionada) {
                    mostrarNodoYAdyacentes(nodo);
                }
            } else if (nodo.dato instanceof Micro && tipoTransporte.equals("Micro")) {
                Micro micro = (Micro) nodo.dato;
                if (micro.getLineaMicro() == lineaSeleccionada) {
                    mostrarNodoYAdyacentes(nodo);
                }
            }
        }
    }

    private void mostrarNodoYAdyacentes(Nodo nodo) {
        if (nodo.dato instanceof Tren) {
            Tren tren = (Tren) nodo.dato;
            System.out.println("\tTren\nNombre: " + tren.getNombre() +
                    "\nLínea: " + tren.getLineaTren() +
                    "\nCalle: " + tren.getNombreCalle() +
                    "\nHora de apertura: " + tren.getHoraInicio() + " AM" +
                    "\nHora de cierre: " + tren.getHoraCierre() + " PM" +
                    "\nTrasborda: " + tren.getTrasbordar());
        } else if (nodo.dato instanceof Micro) {
            Micro micro = (Micro) nodo.dato;
            System.out.println("\tMicro\nNombre: " + micro.getNombre() +
                    "\nLínea: " + micro.getLineaMicro() +
                    "\nCalle: " + micro.getNombreCalle() +
                    "\nHora de apertura: " + micro.getHoraInicio() + " AM" +
                    "\nHora de cierre: " + micro.getHoraCierre() + " PM" +
                    "\nTrasborda: " + micro.getTrasbordar());
        }

        // Mostrar estaciones adyacentes
        if (!nodo.adyacentes.isEmpty()) {
            System.out.println("Estaciones adyacentes:");
            for (Nodo adyacente : nodo.adyacentes) {
                if (adyacente.dato instanceof Tren) {
                    Tren trenAdyacente = (Tren) adyacente.dato;
                    System.out.println("\t- Tren: " + trenAdyacente.getNombre());
                } else if (adyacente.dato instanceof Micro) {
                    Micro microAdyacente = (Micro) adyacente.dato;
                    System.out.println("\t- Micro: " + microAdyacente.getNombre());
                }
            }
        }
        System.out.println();
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