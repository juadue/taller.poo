/**
 * 
 */
package edu.itli.talleres.poo.vehiculos;

/**
 * @author juan1
 *
 */
public class Moto extends Vehiculo {
	
	private int cilindraje ;
	
	
	public Moto(String marca, String placa, String tipo) {
		super(marca, placa, tipo);
	}
	
	public Moto(String marca, String placa, String tipo,int cilindraje) {
		super(marca, placa, tipo);
		this.cilindraje= cilindraje;
	}
	
	
	
	
	public void imprimirDatos() {
		System.out.println("***************MOTO***************");
		super.imprimirDatos();
		System.out.println("Cilindraje: "+cilindraje);
		System.out.println("----------------------------------");
	}
	
	public String imprimirDatos2() {
		System.out.println("****imprimirDatos2******");
		return "OK";
		
		
	}
	
	

	
	/**
	 * @return the cilindraje
	 */
	public int getCilindraje() {
		return cilindraje;
	}


	/**
	 * @param cilindraje the cilindraje to set
	 */
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	
	

}
