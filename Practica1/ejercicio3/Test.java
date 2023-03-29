package ejercicio3;

public class Test {

	public static void main(String[] args) {
		Estudiante[] estudiantes = new Estudiante[2];

		Profesor[] profesores = { new Profesor(), new Profesor(), new Profesor()};

		// CARGA DATOS EN EL ARREGLO DE ESTUDIANTES -------

		int e = 0;
		estudiantes[e] = new Estudiante();
		estudiantes[e].setNombre("Juan");
		estudiantes[e].setApellido("Soto");
		estudiantes[e].setEmail("jansoto@gmail.com");
		estudiantes[e].setDireccion("calle x entre w y z");
		estudiantes[e].setComision(4);
		
		estudiantes[e] = new Estudiante();
		estudiantes[e].setNombre("Gabi");
		estudiantes[e].setApellido("Herrera");
		estudiantes[e].setEmail("gabiherrera@gmail.com");
		estudiantes[e].setDireccion("calle t entre f y p");
		estudiantes[e].setComision(9);

		// CARGA DATOS EN EL ARREGLO DE PROFESORES -------

		int p = 0;
		profesores[p].setNombre("Leila");
		profesores[p].setApellido("Schofi");
		profesores[p].setEmail("leileschofi@gmail.com");
		profesores[p].setCatedra("CADP");
		profesores[p].setFacultad("UNLP");

		p++;

		profesores[p].setNombre("Fernando");
		profesores[p].setApellido("Lis");
		profesores[p].setEmail("fernandolis@gmail.com");
		profesores[p].setCatedra("AYED");
		profesores[p].setFacultad("UNLP");

		p++;

		profesores[p].setNombre("Maitena");
		profesores[p].setApellido("Sechi");
		profesores[p].setEmail("meitesechi@gmail.com");
		profesores[p].setCatedra("ORG");
		profesores[p].setFacultad("UNLP");

		// IMPRIME LOS DATOS DE LOS ESTUDIANTES Y LOS PROFESORES

		System.out.println("------- ESTUDIANTES --------");
		for (Estudiante est : estudiantes) {
			System.out.println(est.tusDatos());
		}

		System.out.println("\n------- PROFESORES --------");
		for (Profesor prof : profesores) {
			System.out.println(prof.tusDatos());
		}
	}

}
