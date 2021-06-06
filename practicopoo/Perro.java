package practicopoo;

public class Perro implements SerVivo{
	
	public enum Raza {
        MUYPEQUEÑA, PEQUEÑA, MEDIANA, GRANDE
    };
	
	private String nombre;
	//Raza muy pequeña a 8 meses es adulto, Raza pequeña a los 10 meses es adulto, Raza mediana a los 12 meses es adulto, Raza grande 15 meses es adulto. Datos buscados en google.
	private Raza raza;
	//Edad en meses
	private int edad;
	private char sexo;
	

	public Perro() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public void cumpleaños() {
		//Raza muy pequeña envejece 4 años por cada uno que pasa. La edad la guardo en meses.
		if(this.getRaza().toString()=="MUYPEQUEÑA") {
			// 48 meses son 4 años por cada uno que pasa
			setEdad(48);	
		}
		//Raza pequeña envejece 6 años por cada uno que pasa. La edad la guardo en meses.
		if(this.getRaza().toString()=="PEQUEÑA") {
			// 72 meses son 6 años por cada uno que pasa humano
			setEdad(72);	
		}
		if(this.getRaza().toString()=="MEDIANA") {
			// 84 meses son 7 años por cada uno que pasa humano
			setEdad(84);	
		}
		if(this.getRaza().toString()=="GRANDE") {
			// 96 meses son 8 años por cada uno que pasa humano
			setEdad(96);	
		}
	}

	@Override
	public boolean esAdulto() {
		if((this.getRaza().toString()=="MUYPEQUEÑA" && this.getEdad()>=8) || (this.getRaza().toString()=="PEQUEÑA" && this.getEdad()>=10) || (this.getRaza().toString()=="MEDIANA" && this.getEdad()>=12) || (this.getRaza().toString()=="GRANDE" && this.getEdad()>=15)) {
			return true;
		} else {
			return false;	
		}
	}

}
