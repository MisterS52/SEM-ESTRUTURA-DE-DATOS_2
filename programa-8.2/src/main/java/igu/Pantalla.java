/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;
// Importa las clases de la lógica
import com.mycompany.logica.ListaAdyacencia;
import com.mycompany.logica.Tren;
import com.mycompany.logica.Micro;
import com.mycompany.logica.Nodo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import igu.Pantalla2;
import igu.Pantalla3;
import igu.Elimin;
import java.util.Scanner;

/**
 *
 * @author JOVANNI SG
 */
public class Pantalla extends javax.swing.JFrame {
//ListaAdyacencia listaTransporte = new ListaAdyacencia();
ListaAdyacencia listaTransporte; // Lista original
ListaAdyacencia listaDeserializada; // Lista deserializada
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        listaTransporte = new ListaAdyacencia(); // Inicializar aquí
        //listaDeserializada = new ListaAdyacencia(); // Inicializar aquí
        initComponents();
      //inicializarDatos();
        
        // Inicializa algunos datos de ejemplo en el constructor de la ventana
        
        deserializarListaTransporte(); // Llama a deserializar
    }
    // Este método inicializa los datos de transporte que tienes en la lógica
    private void inicializarDatos() {
        //TREN L3
        Tren tren3a01 = new Tren("Arcos Zapopan", 3, "Calz Revolucion", 5, 11, false, 301, "A1");
        Tren tren3a02 = new Tren("Periferico BelenesA", 3, "Calz Revolucion", 5, 11, true, 302, "A2");
        Tren tren3a03 = new Tren("Mercado del Mar", 3, "Calz Revolucion", 5, 11, false, 303, "A3");
        Tren tren3a04 = new Tren("Zapopan Centro", 3, "Calz Revolucion", 5, 11, false, 304, "A4");
        Tren tren3a05 = new Tren("Plaza Patria", 3, "Calz Revolucion", 5, 11, false, 305, "A5");
        Tren tren3a06 = new Tren("Circumpalacion Contri", 3, "Calz Revolucion", 5, 11, false, 306, "A6");
        Tren tren3a07 = new Tren("Avila Camacho", 3, "Calz Revolucion", 5, 11, true, 307, "A7");
        Tren tren3a08 = new Tren("La Normal", 3, "Calz Revolucion", 5, 11, false, 308, "A8");
        Tren tren3a09 = new Tren("Santuario", 3, "Calz Revolucion", 5, 11, false, 309, "A9");
        Tren tren3a10 = new Tren("Guadalajara Centro", 3, "Calz Revolucion", 5, 11, true, 310, "A10");
        Tren tren3a11 = new Tren("Indepencia BicentenarioA", 3, "Calz Revolucion", 5, 11, true, 311, "A11");
        Tren tren3a12 = new Tren("Plaza de la Bandera", 3, "Calz Revolucion", 5, 11, false, 312, "A12");
        Tren tren3a13 = new Tren("CUCEI", 3, "Calz Revolucion", 5, 11, false, 313, "A13");
        Tren tren3a14 = new Tren("Revolucion", 3, "Ramon lopez Velarde", 5, 11, false, 314, "A14");
        Tren tren3a15 = new Tren("Rio Nilo", 3, "Calz Revolucion", 5, 11, false, 315, "A15");
        Tren tren3a16 = new Tren("Tlaquepaque Centro", 3, "Calz Revolucion", 5, 11, false, 316, "A16");
        Tren tren3a17 = new Tren("Lazaro Cardenas", 3, "Calz Revolucion", 5, 11, false, 317, "A17");
        Tren tren3a18 = new Tren("Central Camionera", 3, "Calz Revolucion", 5, 11, false, 318, "A18");
        
        //TREN L2
        Tren tren2a01 = new Tren("JuarezA", 2, "Av.Juarez", 5, 11, true, 201, "B1");
        Tren tren2a02 = new Tren("Plaza Universidad", 2, "Av.Juarez", 5, 11, true, 202, "B2");
        Tren tren2a03 = new Tren("San Juan de DiosA", 2, "Av.Juarez", 5, 11, true, 203, "B3");
        Tren tren2a04 = new Tren("Belisario Dominez", 2, "Av.Juarez", 5, 11, false, 204, "B4");
        Tren tren2a05 = new Tren("Oblatos", 2, "Av.Juarez", 5, 11, false, 205, "B5");
        Tren tren2a06 = new Tren("Cristobal de Oñate", 2, "Av.Juarez", 5, 11, false, 206, "B6");
        Tren tren2a07 = new Tren("San Andres", 2, "Av.Juarez", 5, 11, false, 207, "B7");
        Tren tren2a08 = new Tren("San Jacinto", 2, "Av.Juarez", 5, 11, false, 208, "B8");
        Tren tren2a09 = new Tren("La Aurora", 2, "Av.Juarez", 5, 11, false, 209, "B9");
        Tren tren2a10 = new Tren("Tetlan", 2, "Av.Juarez", 5, 11, false, 210, "B10");
        //TREN L1
        Tren tren1a01 = new Tren("Auditorio", 1, "Calz Federalismo", 5, 11, false, 101, "C1");
        Tren tren1a02 = new Tren("Periférico Norte", 1, "Calz Federalismo", 5, 11, false, 102, "C2");
        Tren tren1a03 = new Tren("Dermatologia", 1, "Calz Federalismo", 5, 11, true, 103, "C3");
        Tren tren1a04 = new Tren("Atemajac", 1, "Calz Federalismo", 5, 11, false, 104, "C4");
        Tren tren1a05 = new Tren("Division del Norte", 1, "Calz Federalismo", 5, 11, false, 105, "C5");
        Tren tren1a06 = new Tren("Ávila CamachoB", 1, "Calz Federalismo", 5, 11, true, 106, "C6");
        Tren tren1a07 = new Tren("Mezquitan", 1, "Calz Federalismo", 5, 11, false, 107, "C7");
        Tren tren1a08 = new Tren("Refugio", 1, "Calz Federalismo", 5, 11, false, 108, "C8");
        Tren tren1a09 = new Tren("JuarezB", 1, "Calz Federalismo", 5, 11, true, 109, "C9");
        Tren tren1a10 = new Tren("Mexicaltzingo", 1, "Calz Federalismo", 5, 11, false, 110, "C10");
        Tren tren1a11 = new Tren("Washington", 1, "Calz Federalismo", 5, 11, false, 111, "C11");
        Tren tren1a12 = new Tren("Santa Filomena", 1, "Calz Federalismo", 5, 11, false, 112, "C12");
        Tren tren1a13 = new Tren("Unidad Deportiva", 1, "Calz Federalismo", 5, 11, false, 113, "C13");
        Tren tren1a14 = new Tren("Urdaneta", 1, "Calz Federalismo", 5, 11, false, 114, "C14");
        Tren tren1a15 = new Tren("18 de Marzo", 1, "Calz Federalismo", 5, 11, false, 115, "C15");
        Tren tren1a16 = new Tren("Isla Raza", 1, "Calz Federalismo", 5, 11, false, 116, "C16");
        Tren tren1a17 = new Tren("Patria Sur", 1, "Calz Federalismo", 5, 11, false, 117, "C17");
        Tren tren1a18 = new Tren("España", 1, "Calz Federalismo", 5, 11, false, 118, "C18");
        Tren tren1a19 = new Tren("Martin de Cristo", 1, "Calz Federalismo", 5, 11, false, 119, "C19");
        Tren tren1a20 = new Tren("Periférico Sur", 1, "Calz Federalismo", 5, 11, false, 120, "C20");
        
        //MICRO L1
        Micro micro1a01 = new Micro("Mirador", 1, "Calz Idependencia", 6, 10, false, 401, "D1");
        Micro micro1a02 = new Micro("Huentitan", 1, "Calz Idependencia", 6, 10, false, 402, "D2");
        Micro micro1a03 = new Micro("Zooloico", 1, "Calz Idependencia", 6, 10, false, 402, "D3");
        Micro micro1a04 = new Micro("Independencia NorteA", 1, "Calz Idependencia", 6, 10, false, 404, "D4");
        Micro micro1a05 = new Micro("San Patricio", 1, "Calz Idependencia", 6, 10, false, 405, "D5");
        Micro micro1a06 = new Micro("Iguladad", 1, "Calz Idependencia", 6, 10, false, 406, "D6");
        Micro micro1a07 = new Micro("Monumental", 1, "Calz Idependencia", 6, 10, false, 407, "D7");
        Micro micro1a08 = new Micro("Monte Olivette", 1, "Calz Idependencia", 6, 10, false, 408, "D8");
        Micro micro1a09 = new Micro("Circunvalacion", 1, "Calz Idependencia", 6, 10, false, 409, "D9");
        Micro micro1a10 = new Micro("Ciencias de laSalud", 1, "Calz Idependencia", 6, 10, false, 410, "D10");
        Micro micro1a11 = new Micro("Juan Alvarez", 1, "Calz Idependencia", 6, 10, false, 411, "D11");
        Micro micro1a12 = new Micro("San Juan de DiosB", 1, "Calz Idependencia", 6, 10, true, 412, "D12");
        Micro micro1a13 = new Micro("Independencia BicentenarioB", 1, "Calz Idependencia", 6, 10, true, 413, "D13");
        Micro micro1a14 = new Micro("Niños Heroes", 1, "Calz Idependencia", 6, 10, false, 414, "D14");
        Micro micro1a15 = new Micro("Agua Azul", 1, "Calz Idependencia", 6, 10, false, 415, "D15");
        Micro micro1a16 = new Micro("Cipres", 1, "Calz Idependencia", 6, 10, false, 416, "D16");
        Micro micro1a17 = new Micro("Héroes de Nacozai", 1, "Calz Idependencia", 6, 10, false, 417, "D17");
        Micro micro1a18 = new Micro("Lazaro Cardenas", 1, "Calz Idependencia", 6, 10, false, 418, "D18");
        Micro micro1a19 = new Micro("El Dean", 1, "Calz Idependencia", 6, 10, false, 419, "D19");
        Micro micro1a20 = new Micro("Zona Idustrial", 1, "Calz Idependencia", 6, 10, false, 420, "D20");
        Micro micro1a21 = new Micro("López de Legazpi", 1, "Calz Idependencia", 6, 10, false, 421, "D21");
        Micro micro1a22 = new Micro("Clemente Orozco", 1, "Calz Idependencia", 6, 10, false, 422, "D22");
        Micro micro1a23 = new Micro("Artes Plasticas", 1, "Calz Idependencia", 6, 10, false, 423, "D23");
        Micro micro1a24 = new Micro("Esculturas", 1, "Calz Idependencia", 6, 10, false, 424, "D24");
        Micro micro1a25 = new Micro("Fray Angelico", 1, "Calz Idependencia", 6, 10, false, 425, "D25");
        //MICRO L2
        Micro micro2a01 = new Micro("Barranca de Huentitan", 2, "Periférico", 6, 10, false, 501, "E1");
        Micro micro2a02 = new Micro("Zoologico Guadalajara", 2, "Periférico", 6, 10, false, 502, "E2");
        Micro micro2a03 = new Micro("Independencia NorteB", 2, "Periférico", 6, 10, true, 503, "E3");
        Micro micro2a04 = new Micro("Lomas del Paraiso", 2, "Periférico", 6, 10, false, 504, "E4");
        Micro micro2a05 = new Micro("Rancho Nuevo", 2, "Periférico", 6, 10, false, 505, "E5");
        Micro micro2a06 = new Micro("La Experiencia", 2, "Periférico", 6, 10, false, 506, "E6");
        Micro micro2a07 = new Micro("El Batan", 2, "Periférico", 6, 10, false, 507, "E7");
        Micro micro2a08 = new Micro("Periferico NorteB", 2, "Periférico", 6, 10, true, 508, "E8");
        Micro micro2a09 = new Micro("La Cantera", 2, "Periférico", 6, 10, false, 509, "E9");
        Micro micro2a10 = new Micro("Tabachines", 2, "Periférico", 6, 10, false, 510, "E10");
        Micro micro2a11 = new Micro("Constitucion", 2, "Periférico", 6, 10, false, 511, "E11");
        Micro micro2a12 = new Micro("Centro Cultural Universitario", 2, "Periférico", 6, 10, false, 512, "E12");
        Micro micro2a13 = new Micro("San Isidro", 2, "Periférico", 6, 10, false, 513, "E13");
        Micro micro2a14 = new Micro("Periférico BelenesB", 2, "Periférico", 6, 10, false, 514, "E14");
        Micro micro2a15 = new Micro("Tuzania", 2, "Periférico", 6, 10, false, 515, "E15");
        Micro micro2a16 = new Micro("Santa Margarita", 2, "Periférico", 6, 10, false, 516, "E16");
        Micro micro2a17 = new Micro("Acueducto", 2, "Periférico", 6, 10, false, 517, "E17");
        Micro micro2a18 = new Micro(" 5 de Mayo", 2, "Periférico", 6, 10, false, 518, "E18");
        Micro micro2a19 = new Micro("San Juan de Occidente", 2, "Periférico", 6, 10, false, 519, "E19");
        Micro micro2a20 = new Micro("Vallarta", 2, "Periférico", 6, 10, false, 520, "E20");
        Micro micro2a21 = new Micro("Estadio Chivas", 2, "Periférico", 6, 10, false, 521, "E21");
        Micro micro2a22 = new Micro("Ciudad Judicial", 2, "Periférico", 6, 10, false, 522, "E22");
        Micro micro2a23 = new Micro("Ciudad Granja", 2, "Periférico", 6, 10, false, 523, "E23");
        Micro micro2a24 = new Micro("Parque Metropolitano", 2, "Periférico", 6, 10, false, 524, "E24");
        Micro micro2a25 = new Micro("Chapalita inn", 2, "Periférico", 6, 10, false, 525, "E25");
        Micro micro2a26 = new Micro("El Colli", 2, "Periférico", 6, 10, false, 526, "E26");
        Micro micro2a27 = new Micro("Felipe Ruvalcaba ", 2, "Periférico", 6, 10, false, 527, "E27");
        Micro micro2a28 = new Micro("Miramar", 2, "Periférico", 6, 10, false, 520, "E28");
        Micro micro2a29 = new Micro("Mariano Otero", 2, "Periférico", 6, 10, false, 529, "E29");
        Micro micro2a30 = new Micro("El Briseño", 2, "Periférico", 6, 10, false, 530, "E30");
        Micro micro2a31 = new Micro("Agricola", 2, "Periférico", 6, 10, false, 531, "E31");
        Micro micro2a32 = new Micro("Lopez Mateos", 2, "Periférico", 6, 10, false, 532, "E32");
        Micro micro2a33 = new Micro("ITESO", 2, "Periférico", 6, 10, false, 533, "E33");
        Micro micro2a34 = new Micro("Terminal Sur De Autobuses", 2, "Periférico", 6, 10, false, 534, "E34");
        Micro micro2a35 = new Micro("Periférico SurB", 2, "Periférico", 6, 10, true, 535, "E35");
        Micro micro2a36 = new Micro("San Sebastian", 2, "Periférico", 6, 10, false, 536, "E36");
        Micro micro2a37 = new Micro("8 de Julio", 2, "Periférico", 6, 10, false, 537, "E37");
        Micro micro2a38 = new Micro("Toloquilla", 2, "Periférico", 6, 10, false, 538, "E38");
        Micro micro2a39 = new Micro("Adolf Horn", 2, "Periférico", 6, 10, false, 539, "E39");
        Micro micro2a40 = new Micro("Artesanos", 2, "Periférico", 6, 10, false, 540, "E40");
        Micro micro2a41 = new Micro("Las pintas", 2, "Periférico", 6, 10, false, 541, "E41");
        Micro micro2a42 = new Micro("Carretera a Chapala", 2, "Periférico", 6, 10, false, 542, "E42");

        // Agregar nodos (estaciones)
        //TREN L3
        listaTransporte.agregarNodo(tren3a01.getNombre(), tren3a01);
        listaTransporte.agregarNodo(tren3a02.getNombre(), tren3a02);
        listaTransporte.agregarNodo(tren3a03.getNombre(), tren3a03);
        listaTransporte.agregarNodo(tren3a04.getNombre(), tren3a04);
        listaTransporte.agregarNodo(tren3a05.getNombre(), tren3a05);
        listaTransporte.agregarNodo(tren3a06.getNombre(), tren3a06);
        listaTransporte.agregarNodo(tren3a07.getNombre(), tren3a07);
        listaTransporte.agregarNodo(tren3a08.getNombre(), tren3a08);
        listaTransporte.agregarNodo(tren3a09.getNombre(), tren3a09);
        listaTransporte.agregarNodo(tren3a10.getNombre(), tren3a10);
        listaTransporte.agregarNodo(tren3a11.getNombre(), tren3a11);
        listaTransporte.agregarNodo(tren3a12.getNombre(), tren3a12);
        listaTransporte.agregarNodo(tren3a13.getNombre(), tren3a13);
        listaTransporte.agregarNodo(tren3a14.getNombre(), tren3a14);
        listaTransporte.agregarNodo(tren3a15.getNombre(), tren3a15);
        listaTransporte.agregarNodo(tren3a16.getNombre(), tren3a16);
        listaTransporte.agregarNodo(tren3a17.getNombre(), tren3a17);
        listaTransporte.agregarNodo(tren3a18.getNombre(), tren3a18);
        //TREN L2
        listaTransporte.agregarNodo(tren2a01.getNombre(), tren2a01);
        listaTransporte.agregarNodo(tren2a02.getNombre(), tren2a02);
        listaTransporte.agregarNodo(tren2a03.getNombre(), tren2a03);
        listaTransporte.agregarNodo(tren2a04.getNombre(), tren2a04);
        listaTransporte.agregarNodo(tren2a05.getNombre(), tren2a05);
        listaTransporte.agregarNodo(tren2a06.getNombre(), tren2a06);
        listaTransporte.agregarNodo(tren2a07.getNombre(), tren2a07);
        listaTransporte.agregarNodo(tren2a08.getNombre(), tren2a08);
        listaTransporte.agregarNodo(tren2a09.getNombre(), tren2a09);
        listaTransporte.agregarNodo(tren2a10.getNombre(), tren2a10);
        //TREN L1
        listaTransporte.agregarNodo(tren1a01.getNombre(), tren1a01);
        listaTransporte.agregarNodo(tren1a02.getNombre(), tren1a02);
        listaTransporte.agregarNodo(tren1a03.getNombre(), tren1a03);
        listaTransporte.agregarNodo(tren1a04.getNombre(), tren1a04);
        listaTransporte.agregarNodo(tren1a05.getNombre(), tren1a05);
        listaTransporte.agregarNodo(tren1a06.getNombre(), tren1a06);
        listaTransporte.agregarNodo(tren1a07.getNombre(), tren1a07);
        listaTransporte.agregarNodo(tren1a08.getNombre(), tren1a08);
        listaTransporte.agregarNodo(tren1a09.getNombre(), tren1a09);
        listaTransporte.agregarNodo(tren1a10.getNombre(), tren1a10);
        listaTransporte.agregarNodo(tren1a11.getNombre(), tren1a11);
        listaTransporte.agregarNodo(tren1a12.getNombre(), tren1a12);
        listaTransporte.agregarNodo(tren1a13.getNombre(), tren1a13);
        listaTransporte.agregarNodo(tren1a14.getNombre(), tren1a14);
        listaTransporte.agregarNodo(tren1a15.getNombre(), tren1a15);
        listaTransporte.agregarNodo(tren1a16.getNombre(), tren1a16);
        listaTransporte.agregarNodo(tren1a17.getNombre(), tren1a17);
        listaTransporte.agregarNodo(tren1a18.getNombre(), tren1a18);
        listaTransporte.agregarNodo(tren1a19.getNombre(), tren1a19);
        listaTransporte.agregarNodo(tren1a20.getNombre(), tren1a20);
        
        //MICRO L1
        listaTransporte.agregarNodo(micro1a01.getNombre(), micro1a01);
        listaTransporte.agregarNodo(micro1a02.getNombre(), micro1a02);
        listaTransporte.agregarNodo(micro1a03.getNombre(), micro1a03);
        listaTransporte.agregarNodo(micro1a04.getNombre(), micro1a04);
        listaTransporte.agregarNodo(micro1a05.getNombre(), micro1a05);
        listaTransporte.agregarNodo(micro1a06.getNombre(), micro1a06);
        listaTransporte.agregarNodo(micro1a07.getNombre(), micro1a07);
        listaTransporte.agregarNodo(micro1a08.getNombre(), micro1a08);
        listaTransporte.agregarNodo(micro1a09.getNombre(), micro1a09);
        listaTransporte.agregarNodo(micro1a10.getNombre(), micro1a10);
        listaTransporte.agregarNodo(micro1a11.getNombre(), micro1a11);
        listaTransporte.agregarNodo(micro1a12.getNombre(), micro1a12);
        listaTransporte.agregarNodo(micro1a13.getNombre(), micro1a13);
        listaTransporte.agregarNodo(micro1a14.getNombre(), micro1a14);
        listaTransporte.agregarNodo(micro1a15.getNombre(), micro1a15);
        listaTransporte.agregarNodo(micro1a16.getNombre(), micro1a16);
        listaTransporte.agregarNodo(micro1a17.getNombre(), micro1a17);
        listaTransporte.agregarNodo(micro1a18.getNombre(), micro1a18);
        listaTransporte.agregarNodo(micro1a19.getNombre(), micro1a19);
        listaTransporte.agregarNodo(micro1a20.getNombre(), micro1a20);
        listaTransporte.agregarNodo(micro1a21.getNombre(), micro1a21);
        listaTransporte.agregarNodo(micro1a22.getNombre(), micro1a22);
        listaTransporte.agregarNodo(micro1a23.getNombre(), micro1a23);
        listaTransporte.agregarNodo(micro1a24.getNombre(), micro1a24);
        listaTransporte.agregarNodo(micro1a25.getNombre(), micro1a25);
        //MICRO L2
        listaTransporte.agregarNodo(micro2a01.getNombre(), micro2a01);
        listaTransporte.agregarNodo(micro2a02.getNombre(), micro2a02);
        listaTransporte.agregarNodo(micro2a03.getNombre(), micro2a03);
        listaTransporte.agregarNodo(micro2a04.getNombre(), micro2a04);
        listaTransporte.agregarNodo(micro2a05.getNombre(), micro2a05);
        listaTransporte.agregarNodo(micro2a06.getNombre(), micro2a06);
        listaTransporte.agregarNodo(micro2a07.getNombre(), micro2a07);
        listaTransporte.agregarNodo(micro2a08.getNombre(), micro2a08);
        listaTransporte.agregarNodo(micro2a09.getNombre(), micro2a09);
        listaTransporte.agregarNodo(micro2a10.getNombre(), micro2a10);
        listaTransporte.agregarNodo(micro2a11.getNombre(), micro2a11);
        listaTransporte.agregarNodo(micro2a12.getNombre(), micro2a12);
        listaTransporte.agregarNodo(micro2a13.getNombre(), micro2a13);
        listaTransporte.agregarNodo(micro2a14.getNombre(), micro2a14);
        listaTransporte.agregarNodo(micro2a15.getNombre(), micro2a15);
        listaTransporte.agregarNodo(micro2a16.getNombre(), micro2a16);
        listaTransporte.agregarNodo(micro2a17.getNombre(), micro2a17);
        listaTransporte.agregarNodo(micro2a18.getNombre(), micro2a18);
        listaTransporte.agregarNodo(micro2a19.getNombre(), micro2a19);
        listaTransporte.agregarNodo(micro2a20.getNombre(), micro2a20);
        listaTransporte.agregarNodo(micro2a21.getNombre(), micro2a21);
        listaTransporte.agregarNodo(micro2a22.getNombre(), micro2a22);
        listaTransporte.agregarNodo(micro2a23.getNombre(), micro2a23);
        listaTransporte.agregarNodo(micro2a24.getNombre(), micro2a24);
        listaTransporte.agregarNodo(micro2a25.getNombre(), micro2a25);
        listaTransporte.agregarNodo(micro2a26.getNombre(), micro2a26);
        listaTransporte.agregarNodo(micro2a27.getNombre(), micro2a27);
        listaTransporte.agregarNodo(micro2a28.getNombre(), micro2a28);
        listaTransporte.agregarNodo(micro2a29.getNombre(), micro2a29);
        listaTransporte.agregarNodo(micro2a30.getNombre(), micro2a30);
        listaTransporte.agregarNodo(micro2a31.getNombre(), micro2a31);
        listaTransporte.agregarNodo(micro2a32.getNombre(), micro2a32);
        listaTransporte.agregarNodo(micro2a33.getNombre(), micro2a33);
        listaTransporte.agregarNodo(micro2a34.getNombre(), micro2a34);
        listaTransporte.agregarNodo(micro2a35.getNombre(), micro2a35);
        listaTransporte.agregarNodo(micro2a36.getNombre(), micro2a36);        
        listaTransporte.agregarNodo(micro2a37.getNombre(), micro2a37);
        listaTransporte.agregarNodo(micro2a38.getNombre(), micro2a38);
        listaTransporte.agregarNodo(micro2a39.getNombre(), micro2a39);
        listaTransporte.agregarNodo(micro2a40.getNombre(), micro2a40);
        listaTransporte.agregarNodo(micro2a41.getNombre(), micro2a41);
        listaTransporte.agregarNodo(micro2a42.getNombre(), micro2a42);
        /*/ Establecer adyacencias (conexiones entre estaciones)
        listaTransporte.agregarAdyacencia(tren3a13.getNombre(), tren3a14.getNombre());
        listaTransporte.agregarAdyacencia(micro1.getNombre(), micro2.getNombre());
        listaTransporte.agregarAdyacencia(micro2.getNombre(), micro1.getNombre());
        listaTransporte.agregarAdyacencia(micro2.getNombre(), micro3.getNombre());
        listaTransporte.agregarAdyacencia(micro3.getNombre(), micro2.getNombre());*/
    
    
    // SERIALIZAR listaTransporte
    try (FileOutputStream fileOut = new FileOutputStream("listaTransporte.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
        out.writeObject(listaTransporte);
        System.out.println("Lista de transporte serializada y guardada en listaTransporte.ser");
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
  private void deserializarListaTransporte() {
    // DESERIALIZAR listaTransporte
    try (FileInputStream fileIn = new FileInputStream("listaTransporte.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn)) {
        listaDeserializada = (ListaAdyacencia) in.readObject(); // Cambiado para asignar a la variable de instancia
        System.out.println("Lista de transporte deserializada con éxito.");
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        listaDeserializada = null; // Asegúrate de que sea nulo si hay un error
    }

    // Verificación para asegurarse de que la lista fue deserializada correctamente
    if (listaDeserializada == null) {
        inicializarDatos();
        System.out.println("Error: No se pudo deserializar la lista de transporte.");
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        odcion1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        odcion2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFibal = new javax.swing.JTextPane();
        AGREAR = new javax.swing.JButton();
        ConEst = new javax.swing.JToggleButton();
        Elim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("STPMG");

        odcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odcion1ActionPerformed(evt);
            }
        });

        jLabel2.setText("¿Qué vehículo quieres saber? 1-Micro 2-Tren:");

        jLabel3.setText("¿Qué línea  quieres?");

        odcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odcion2ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar");
        jButton2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jButton2ComponentMoved(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtFibal);

        AGREAR.setText("NUEVO");
        AGREAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREARActionPerformed(evt);
            }
        });

        ConEst.setText("Conecar estaciones");
        ConEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConEstActionPerformed(evt);
            }
        });

        Elim.setText("ELIMINAR");
        Elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(odcion2)
                            .addComponent(odcion1))
                        .addGap(124, 124, 124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConEst)
                .addGap(72, 72, 72)
                .addComponent(Elim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AGREAR))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(odcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(odcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGREAR)
                    .addComponent(ConEst)
                    .addComponent(Elim))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void odcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odcion1ActionPerformed

        
    }//GEN-LAST:event_odcion1ActionPerformed

    private void odcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odcion2ActionPerformed

    private void jButton2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ComponentMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener las opciones seleccionadas por el usuario
            int vehiculoSeleccionado = Integer.parseInt(odcion1.getText()); // 1 para Micro, 2 para Tren
            int lineaSeleccionada = Integer.parseInt(odcion2.getText());

            // Variable para almacenar el resultado
            String resultado = "";

            // Según el tipo de vehículo
            if (vehiculoSeleccionado == 1) {
                // Mostrar los micros de la línea seleccionada
                resultado = listaDeserializada.mostrarElementosPorClaseYLinea("Micro", lineaSeleccionada);
                
            } else if (vehiculoSeleccionado == 2) {
                // Mostrar los trenes de la línea seleccionada
                resultado = listaDeserializada.mostrarElementosPorClaseYLinea("Tren", lineaSeleccionada);
            } else {
                // Si la opción no es válida
                JOptionPane.showMessageDialog(this, "Opción no válida. Selecciona 1 para Micro o 2 para Tren.");
                return;
            }

            // Mostrar el resultado en el JTextPane
            txtFibal.setText(resultado);

        } catch (NumberFormatException e) {
            // Manejar el error si el usuario no ingresa números válidos
            JOptionPane.showMessageDialog(this, "Por favor ingresa números válidos en las opciones.");
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AGREARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREARActionPerformed
        // TODO add your handling code here:
        Scanner scanner = new Scanner(System.in);
        Pantalla2 panta = new Pantalla2(this);
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
    }//GEN-LAST:event_AGREARActionPerformed

    private void ConEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConEstActionPerformed
        // TODO add your handling code here:
          Scanner scanner = new Scanner(System.in);
        Pantalla3 panta = new Pantalla3(this);
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
    }//GEN-LAST:event_ConEstActionPerformed

    private void ElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimActionPerformed
        // TODO add your handling code here:
         Scanner scanner = new Scanner(System.in);
        Elimin panta = new Elimin(this);
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
    }//GEN-LAST:event_ElimActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREAR;
    private javax.swing.JToggleButton ConEst;
    private javax.swing.JButton Elim;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField odcion1;
    private javax.swing.JTextField odcion2;
    private javax.swing.JTextPane txtFibal;
    // End of variables declaration//GEN-END:variables
}
