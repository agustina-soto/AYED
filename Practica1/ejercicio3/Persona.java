package ejercicio3;

public class Persona {
	private String nombre;
	private String apellido;
	private String email;

	public Persona() {
		
	}

	public Persona(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
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

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	// Retorna un String con los datos de los atributos
	public String tusDatos() {
		String infoPersonal = this.getNombre() + " - "
							+ this.getApellido() + " - "
							+ this.getEmail();
		return infoPersonal;
	}
}
