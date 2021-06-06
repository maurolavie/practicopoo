package practicopoo;

import practicopoo.Perro.Raza;

public class PracticoProgramacionOrientadaObjetos {

	public static void main(String[] args) {
		
		Uruguayo uruguayo = new Uruguayo();
		Chileno chileno = new Chileno();
		Perro perro = new Perro();
		Raza raza = Raza.MUYPEQUEÑA;
		Chileno chileno2 = new Chileno();
		
		Cedula ci = new Cedula();
		
		uruguayo.setNombre("Juan");
		uruguayo.setApellido("Lavié");
		uruguayo.setEdad(40);
		uruguayo.setSexo('M');
		//Cambio cedula en la clase Uruguayo queda comentado el codigo anterior
		//uruguayo.setCi("1.234.567-2");
		//Nueva cedula
		ci.setNumero(1234567);
		ci.setDigitoVerificador(2);
		uruguayo.setCi(ci);
		uruguayo.setDepartamento("Paysandú");
		uruguayo.setBarrio("El Bulevar");
		
		chileno.setNombre("Agustina");
		chileno.setApellido("Rojas");
		chileno.setEdad(30);
		chileno.setSexo('F');
		chileno.setDni(100000001);
		chileno.setRegion("Antofagasta");
		chileno.setComuna("Sierra Gorda");

		perro.setNombre("Firulais");
		perro.setRaza(raza);
		// Guardo la edad en meses 144/12 = 12
		perro.setEdad(144);
		perro.setSexo('M');
		
		chileno2.setNombre("Pedro");
		chileno2.setApellido("Rojas");
		chileno2.setEdad(12);
		chileno2.setSexo('M');
		chileno2.setDni(100000002);
		chileno2.setRegion("Antofagasta");
		chileno2.setComuna("Sierra Gorda");
		
		System.out.println("Chileno Pedro es adulto: " + chileno2.esAdulto());
		System.out.println("Perro Firulais es adulto: " + perro.esAdulto());
	}
	
	public static boolean soyUruguayoOChileno(Persona persona) {
		if(persona instanceof Uruguayo || persona instanceof Chileno) {
			return true;
		} else {
			return false;
		}
	}
	
}
