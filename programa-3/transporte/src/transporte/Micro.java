package transporte;
import java.io.Serializable;
public class Micro implements Serializable
{
    private String nombre;
    private int lineaMicro;
    private String nombreCalle;
    private int horaInicio;
    private int horaCierre;
    private boolean trasbordar;
    private int num;
    private char cadena;
    private static final long serialVersionUID = 1L;
    public String getNombre() {
        return nombre;
    }

    public int getLineaMicro() {
        return lineaMicro;
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

    public char getCadena() {
        return cadena;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLineaTren(int lineaMicro) {
        this.lineaMicro = lineaMicro;
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

    public void setCadena(char cadena) {
        this.cadena = cadena;
    }

    // Constructor (opcional)
    public Micro(String nombre, int lineaMicro, String nombreCalle, 
    int horaInicio, int horaCierre,boolean trasbordar,int num,char cadena) 
    {
        this.nombre = nombre;
        this.lineaMicro = lineaMicro;
        this.nombreCalle = nombreCalle;
        this.horaInicio = horaInicio;
        this.horaCierre = horaCierre;
        this.trasbordar = trasbordar;
        this.num = num;
        this.cadena =cadena;
       
    }
    public String toString()
	{
		return"\tTrenes\n"+"Nombre del Macro buss: " + nombre+"\nLinea del macrobus: "+ lineaMicro+"\nCalle de la estacion: "+nombreCalle+"\nHora de apertura: "+ horaInicio +" AM" + "\nHora de sierre: " +horaCierre+" PM"+ "\nTrasborda: "+ trasbordar+
				"\nNumero ID:"+num+"\nCadena:"+cadena+ "\n";
	}
}
