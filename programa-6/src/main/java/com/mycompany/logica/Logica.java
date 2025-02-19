/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logica;

import igu.Pantalla;

/**
 *
 * @author JOVANNI SG
 */


import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Logica {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // ListaAdyacencia listaTransporte = new ListaAdyacencia();
        
        Scanner scanner = new Scanner(System.in);
        Pantalla panta = new Pantalla();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
/*
        // Crear algunos trenes y micros
        Tren tren3a1 = new Tren("CUCEI", 3, "Calz Revolucion", 6, 10, false, 132, 'A');
        Tren tren3a2 = new Tren("Revolucion", 3, "Ramon lopez Velarde", 2, 3, false, 132, 'A');
        Tren tren2a1 = new Tren("Juarez", 2, "Av.Juarez", 6, 10, true, 132, 'A');
        
        Micro micro1 = new Micro("Monumental", 1, "Fidel Velasquez", 6, 10, true, 132, 'A');
        Micro micro2 = new Micro("Monte Olimpo", 1, "Monte Olivete", 6, 10, false, 132, 'A');
        Micro micro3 = new Micro("Igualdad", 1, "San Simon", 6, 10, false, 132, 'A');

        // Agregar nodos (estaciones)
        listaTransporte.agregarNodo(tren3a1.getNombre(), tren3a1);
        listaTransporte.agregarNodo(tren3a2.getNombre(), tren3a2);
        listaTransporte.agregarNodo(tren2a1.getNombre(), tren2a1);
        listaTransporte.agregarNodo(micro1.getNombre(), micro1);
        listaTransporte.agregarNodo(micro2.getNombre(), micro2);
        listaTransporte.agregarNodo(micro3.getNombre(), micro3);

        // Establecer adyacencias (conexiones entre estaciones)
        listaTransporte.agregarAdyacencia(tren3a1.getNombre(), tren3a2.getNombre());
        listaTransporte.agregarAdyacencia(micro1.getNombre(), micro2.getNombre());
        listaTransporte.agregarAdyacencia(micro2.getNombre(), micro1.getNombre());
        listaTransporte.agregarAdyacencia(micro2.getNombre(), micro3.getNombre());
        listaTransporte.agregarAdyacencia(micro3.getNombre(), micro2.getNombre());
        // SERIALIZAR listaTransporte
        try (FileOutputStream fileOut = new FileOutputStream("listaTransporte.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(listaTransporte);
            System.out.println("Lista de transporte serializada y guardada en listaTransporte.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

     // DESERIALIZAR listaTransporte
        ListaAdyacencia listaDeserializada = null;
        try (FileInputStream fileIn = new FileInputStream("listaTransporte.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            listaDeserializada = (ListaAdyacencia) in.readObject();
            System.out.println("Lista de transporte deserializada con éxito.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Verificación para asegurarse de que la lista fue deserializada correctamente
        if (listaDeserializada == null) {
            System.out.println("Error: No se pudo deserializar la lista de transporte.");
            return; // Salir del programa si no se puede continuar
        }
        // Menú interactivo
        /*int salir = 0;
        while (salir == 0) {
        	// Limpieza de consola simulada
        	for (int i = 0; i < 50; i++) {
        		System.out.println();
        	}
            System.out.print("¿Qué vehículo quieres saber? 1-Micro 2-Tren: ");
            int seleccionVehiculo = scanner.nextInt();

            switch (seleccionVehiculo) {
                case 1:
                    System.out.print("\n¿Qué línea de Micro quieres? ");
                    int lineaMicro = scanner.nextInt();
                    listaDeserializada.mostrarElementosPorClaseYLinea("Micro", lineaMicro);
                    break;
                case 2:
                    System.out.print("\n¿Qué línea de Tren quieres? ");
                    int lineaTren = scanner.nextInt();
                    listaDeserializada.mostrarElementosPorClaseYLinea("Tren", lineaTren);
                    break;
                default:
                    System.out.println("No existe esa opción.");
            }

            System.out.print("\n¿Quieres salir? 1 sí, 0 no: ");
            salir = scanner.nextInt();

        }*/

        scanner.close();
    }
}
