package ejercicio3;

public class Estudiante extends Persona {

	private int comision;
	private String email;
	private String direccion;

	public Estudiante() {
		
	}

	public Estudiante(String nombre, String apellido, int comision, String email, String direccion) {
		super(nombre, apellido);
		this.comision = comision;
		this.email = email;
		this.direccion = direccion;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// Retorna un String con los datos de los atributos
	public String tusDatos() {
		String infoPersonal = this.getNombre() + " - "
							+ this.getApellido() + " - "
							+ this.getEmail() + " - "
							+ this.getDireccion() + " - "
							+ this.getComision();
		return infoPersonal;
	}
}
