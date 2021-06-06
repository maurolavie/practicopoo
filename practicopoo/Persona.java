package practicopoo;

public class Persona implements SerVivo{
	
	private String nombre;
	private String apellido; 
	private int edad; 
	private char sexo; 

	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	
	public void cumpleaños() {
		setEdad(1);
	}

	@Override
	public boolean esAdulto() {
		if(this.getEdad()>=18) {
			return true;
		} else {
			return false;	
		}
	}

}
