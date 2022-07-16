/**
 * 
 */
package edu.itli.talleres.poo.vehiculos;

/**
 * @author juan1
 *
 */
public class Automovil extends Vehiculo {
	
	private int numPuertas;

	public Automovil(String marca, String placa, String tipo, int numPuertas) {
		super(marca, placa, tipo);
		// TODO Auto-generated constructor stub
		this.numPuertas=numPuertas;
	}
	
	
	
	
	

	@Override
	public void imprimirDatos() {
		System.out.println("***************AUTOMOVIL***************");
		super.imprimirDatos();
		System.out.println("Numero puertas: "+numPuertas);
		System.out.println("----------------------------------");
	}






	/**
	 * @return the numPuertas
	 */
	public int getNumPuertas() {
		return numPuertas;
	}
	
	
	

	/**
	 * @param numPuertas the numPuertas to set
	 */
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	

}
