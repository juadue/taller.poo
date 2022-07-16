/**
 * 
 */
package edu.itli.talleres.poo.personas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author juan1
 *
 */
public class ListinProfesores {
	
	private ArrayList<Profesor> listinProfesores;
	
	
	//Constructor
	
	public ListinProfesores() {
		
		listinProfesores = new ArrayList <Profesor> (); 
	}
	
	
	// Métodos
	
	public void addProfesor(Profesor profesor) {
		listinProfesores.add(profesor);
	}
	
	public void listar() {
		System.out.println("Profesores Existentes");
		for (Profesor tmp: listinProfesores) {
			tmp.mostrarDatos();
			
		}
	}

}
