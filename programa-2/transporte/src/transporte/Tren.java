
package transporte;

public class Tren 
{
	    private String nombre;
	    private int lineaTren;
	    private String nombreCalle;
	    private int horaInicio;
	    private int horaCierre;
	    private boolean trasbordar;
	    private int num;
	    private char cadena;
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

	    public char getCadena() {
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

	    public void setCadena(char cadena) {
	        this.cadena = cadena;
	    }

	    // Constructor (opcional)
	    public Tren(String nombre, int lineaTren, String nombreCalle,  int horaInicio,
	    		int horaCierre,boolean trasbordar,int num,char cadena) 
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
	}
	


