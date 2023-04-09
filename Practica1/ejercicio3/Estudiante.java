package ejercicio3;

public class Estudiante extends Persona {

	private int comision;
	private String direccion;

	public Estudiante() {
		
	}

	public Estudiante(int comision, String direccion) {
		super();
		this.comision = comision;
		this.direccion = direccion;
	}

	public Estudiante(String nombre, String apellido, String email, int comision, String direccion) {
		super(nombre, apellido, email);
		this.comision = comision;
		this.direccion = direccion;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// Retorna un String con los datos de los atributos
	public String tusDatos() {
		String infoPersonal = super.tusDatos() + " - "
							+ this.getDireccion() + " - "
							+ this.getComision();
		return infoPersonal;
	}
}
