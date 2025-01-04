package transporte;

public class programa {

	public static void main(String[] args) 
	{
		ListaEnlazada lista = new ListaEnlazada();
		ListaEnlazada lista2 = new ListaEnlazada();

        Tren tren1 = new Tren("CUCEI", 3,"Calz Revolucion",6,10,false,132,'A');
        Tren tren2 = new Tren("Rebolucion", 3,"Ramon lopez Velardes",2,3,false,132,'A');
        Micro micro1 = new Micro("Estadio Jalisco", 1,"Fidel velasquez",6,10,true,132,'A');

        lista.agregar(tren1);
        lista.agregar(tren2);
        lista2.agregar(micro1);

        //lista.buscar();
        lista2.mostrarElementos();
	}

}
