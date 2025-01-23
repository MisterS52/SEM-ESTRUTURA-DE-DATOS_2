package transporte;

import java.io.Serializable;

public class Nodo implements Serializable {
	Object dato;
    Nodo siguiente;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    

}
