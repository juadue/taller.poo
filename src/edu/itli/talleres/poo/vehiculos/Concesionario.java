package edu.itli.talleres.poo.vehiculos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Concesionario {
	
	private static List<Vehiculo> listaDeVehiculos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listaDeVehiculos=new ArrayList<Vehiculo>();
		Moto moto1=new Moto("YAMAHA", "ABC123", "Señoritera", 125);
		Automovil auto1=new Automovil("FORD", "ABC123", "DEPORTIVO", 4);
		listaDeVehiculos.add(auto1);
		listaDeVehiculos.add(moto1);
		
		Moto moto2=new Moto("SUZUKI", "ABC123", "Señoritera", 125);
		listaDeVehiculos.add(moto2);
		
		Moto moto3=new Moto("SUZUKI", "ABC123", "Señoritera");
		listaDeVehiculos.add(moto3);

		
		listarVehiculos();
	}
	
	private static boolean listarVehiculos() {
		
		for (Iterator iterator = listaDeVehiculos.iterator(); iterator.hasNext();) {
			Vehiculo vehiculo = (Vehiculo) iterator.next();	
			vehiculo.imprimirDatos();
			
			if (vehiculo instanceof Moto) {
				Moto moto = (Moto) vehiculo;
				moto.imprimirDatos2();
				
			}
		}
		 
		return true;
	}
	
	

}
