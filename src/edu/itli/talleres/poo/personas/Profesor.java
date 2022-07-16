package edu.itli.talleres.poo.personas;

public class Profesor extends Persona {
	
	private String idProfesor;

	/**
	 * 
	 */
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
		
		idProfesor="Unknown";
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public Profesor(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
		idProfesor="Unknown";
		
	}

	/**
	 * @return the idProfesor
	 */
	public String getIdProfesor() {
		return idProfesor;
	}

	/**
	 * @param idProfesor the idProfesor to set
	 */
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	public void mostrarDatos() {
		System.out.println("Datos Profesor. Profesor de nombre: "
		+ getNombre() + " " +  getApellidos() 
        +" con Id de profesor: " + getIdProfesor() ); 
	}
	
	
	

}
