package ejercicio2;

import tp02.ejercicio2.*;
import ejercicio3.Estudiante;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<>();
		Estudiante est = new Estudiante();

		est.setNombre("Juan");
		est.setApellido("Soto");
		est.setEmail("juansoto@gmail.com");
		est.setDireccion("calle x entre w y z");
		est.setComision(4);

		lista.agregarInicio(est);

		est = new Estudiante();
		est.setNombre("Gabi");
		est.setApellido("Herrera");
		est.setEmail("gabiherrera@gmail.com");
		est.setDireccion("calle t entre f y p");
		est.setComision(9);

		lista.agregarEn(est, 2);

		est = new Estudiante();
		est.setNombre("Juli");
		est.setApellido("Soto");
		est.setEmail("julisoto@gmail.com");
		est.setDireccion("calle f entre p y z");
		est.setComision(3);

		lista.agregarFinal(est);

		est = new Estudiante();
		est.setNombre("Agus");
		est.setApellido("Soto");
		est.setEmail("agussoto@gmail.com");
		est.setDireccion("calle s entre a y t");
		est.setComision(3);

		lista.agregarFinal(est);

		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo().tusDatos());
		}
	}
}
