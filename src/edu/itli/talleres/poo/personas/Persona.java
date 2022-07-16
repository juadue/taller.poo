/**
 * 
 */
package edu.itli.talleres.poo.personas;

/**
 * @author juan1
 *
 */
public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona() {
		nombre="";
		apellidos="";
		edad=0;
		
	}
	
	/**
	 * @param nombre
	 * @param apelllidos
	 * @param edad
	 */
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	
	
	
	
	
	

}
