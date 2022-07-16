/**
 * 
 */
package edu.itli.talleres.poo.personas;

import java.util.Calendar;

/**
 * @author juan1
 *
 */
public class ProfesorInterino extends Profesor {

	private Calendar fechaComienzoInterinidad;

	/**
	 * 
	 */
	public ProfesorInterino(Calendar fechaComienzaInterinidad) {
		super();
		// TODO Auto-generated constructor stub
		
		fechaComienzoInterinidad = fechaComienzaInterinidad; 
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public ProfesorInterino(String nombre, String apellidos, int edad,Calendar fechaComienzaInterinidad) {
		super(nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
		fechaComienzoInterinidad = fechaComienzaInterinidad; 
	}
	
	public Calendar getFechaComienzoInterinidad () { 
    	return fechaComienzoInterinidad; 
    	}

    public void mostrarDatos() { 
    	System.out.println("Datos ProfesorInterino. Comienzo interinidad: " +
    			fechaComienzoInterinidad.getTime().toString() );  
    	}
	
	

}
