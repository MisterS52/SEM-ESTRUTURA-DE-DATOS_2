package transporte;
//import javax.swing.event.DocumentEvent;
//import javax.swing.event.DocumentListener;
//import java.awt.event.*;

public class ListaEnlazada {
	private Nodo cabeza;
	/*private JTextField campoBusqueda;
	private JList<String> listaResultados;
	private DefaultListModel<String> modeloLista;
	public ListaEnlazada() {
	       
	        modeloLista = new DefaultListModel<String>();
	        listaResultados = new JList<>(modeloLista);
	        campoBusqueda = new JTextField();
	        inicializarGUI();
	    }
	
	private void inicializarGUI() {
		// TODO Auto-generated method stub
		
	}*/

	public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente=nuevoNodo;
            }
    }

    public void mostrarElementos() {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato instanceof Tren) {
                Tren tren = (Tren) actual.dato;
                System.out.println("\tTrenes\n"+"Nombre del Tren: " + tren.getNombre()+"\nLinea del tren: "+ tren.getLineaTren()+"\nCalle de la estacuion: "+tren.getNombreCalle()
                +"\nHora de apertura: "+ tren.getHoraInicio() +" AM" + "\nHora de sierre: " + tren.getHoraCierre()+" PM"+ "\nTrasborda: "+ tren.getTrasbordar() + "\n");
                // ... (mostrar otros atributos del tren)
            } else if (actual.dato instanceof Micro) {
                Micro autobus = (Micro) actual.dato;
                System.out.println("\tMacro\n"+"Nombre del Macro: " + autobus.getNombre()+"\nLinea del Macro buss: " + autobus.getLineaMicro()+"\nCalle de la estacuion: "+autobus.getNombreCalle()
                +"\nHora de apertura: "+ autobus.getHoraInicio() + " AM" + "\nHora de sierre: " + autobus.getHoraCierre()+" PM"+ "\nTrasborda: "+ autobus.getTrasbordar() + "\n");
                // ... (mostrar otros atributos del autobús)
            }
            actual = actual.siguiente;
        }
    }
  /*  public void buscar() {
        String textoBusqueda = campoBusqueda.getText().toLowerCase();
        modeloLista.clear();

        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato instanceof Tren) {
                Tren tren = (Tren) actual.dato;
              if (tren.getNombre().toLowerCase().contains(textoBusqueda) || 
            		  tren.getNombreCalle().toLowerCase().contains(textoBusqueda)) {
                    modeloLista.addElement(tren.toString());
                }
            } else if (actual.dato instanceof Micro) {
                Micro autobus = (Micro) actual.dato;
                // Similar para los objetos Micro
            } 
            actual = actual.siguiente;
        }
    }

    private void inicializarGUI1() {
        // Configurar GUI aquí
        campoBusqueda.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                buscar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                buscar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buscar();
            }
        });
    }*/
}
