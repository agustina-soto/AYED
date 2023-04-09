package ejercicio3;

public class Profesor extends Persona {

	private String catedra;
	private String facultad;

	public Profesor() {
		
	}

	public Profesor(String catedra, String facultad) {
		this.catedra = catedra;
		this.facultad = facultad;
	}

	public Profesor(String nombre, String apellido, String email, String catedra, String facultad) {
		super(nombre, apellido, email);
		this.catedra = catedra;
		this.facultad = facultad;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	// Retorna un String con los datos de los atributos
	public String tusDatos() {
			String infoPersonal = super.tusDatos() + " - "
								+ this.getCatedra() + " - "
								+ this.getFacultad();
			return infoPersonal;
		}
}
