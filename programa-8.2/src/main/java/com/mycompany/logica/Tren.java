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
public class Tren implements Serializable
{
	    private String nombre;
	    private int lineaTren;
	    private String nombreCalle;
	    private int horaInicio;
	    private int horaCierre;
	    private boolean trasbordar;
	    private int num;
	    private String cadena;
	    private static final long serialVersionUID = 1L;
	    // Getters
	    public String getNombre() {
	        return nombre;
	    }

	    public int getLineaTren() {
	        return lineaTren;
	    }

	    public String getNombreCalle() {
	        return nombreCalle;
	    }

	    public int getHoraInicio() {
	        return horaInicio;
	    }

	    public int getHoraCierre() {
	        return horaCierre;
	    }

	    public boolean getTrasbordar() {
	        return trasbordar;
	    }

	    public int getNum() {
	        return num;
	    }

	    public String getCadena() {
	        return cadena;
	    }

	    // Setters
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setLineaTren(int lineaTren) {
	        this.lineaTren = lineaTren;
	    }

	    public void setNombreCalle(String nombreCalle) {
	        this.nombreCalle = nombreCalle;
	    }

	    public void setHoraInicio(int horaInicio) {
	        this.horaInicio = horaInicio;
	    }

	    public void setHoraCierre(int horaCierre) {
	        this.horaCierre = horaCierre;
	    }

	    public void setTrasbordar(boolean trasbordar) {
	        this.trasbordar = trasbordar;
	    }

	    public void setNum(int num) {
	        this.num = num;
	    }

	    public void setCadena(String cadena) {
	        this.cadena = cadena;
	    }

	    // Constructor (opcional)
	    public Tren(String nombre, int lineaTren, String nombreCalle,  int horaInicio,
	    		int horaCierre,boolean trasbordar,int num,String cadena) 
	    {
	        this.nombre = nombre;
	        this.lineaTren = lineaTren;
	        this.nombreCalle = nombreCalle;
	        this.horaInicio = horaInicio;
	        this.horaCierre = horaCierre;
	        this.trasbordar = trasbordar;
	        this.num = num;
	        this.cadena =cadena;
	       
	    }

		public String toString()
		{
			return"\tTrenes\n"+"Nombre del Tren: " + nombre+"\nLinea del tren: "
		          + lineaTren+"\nCalle de la estacion: "+nombreCalle+"\nHora de apertura: "
				  + horaInicio +" AM" + "\nHora de sierre: " +horaCierre+" PM"+ "\nTrasborda: "+ trasbordar+
					"\nNumero ID:"+num+"\nCadena:"+cadena+ "\n";
		}
		
	}
