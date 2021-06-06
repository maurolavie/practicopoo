package practicopoo;

public class Uruguayo extends Persona {
	
	//Cambio el ci por Cedula. Queda comentado el ci anterior 
	//private String ci; 
	//Nuevo ci
	private Cedula ci;
	private String departamento; 
	private String barrio;

	public Uruguayo() {
		
	}

	public Cedula getCi() {
		return ci;
	}

	public void setCi(Cedula ci) {
		this.ci = ci;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public void imprimirInfo() {
		System.out.println("Se imprime datos de la persona uruguaya: ");
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Apellido: " + this.getApellido());
		System.out.println("Edad: " + this.getEdad());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("CI: " + this.getCi());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Barrio: " + this.getBarrio());
	}	
	
	public void mudarse(String departamento, String barrio) {
		this.setDepartamento(departamento);
		this.setBarrio(barrio);
	}
	
}
