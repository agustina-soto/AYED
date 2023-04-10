package tp02.ejercicio3;

import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;

public class PilaGenerica<T> {

	private ListaGenerica<T> datos;
	
	public PilaGenerica() {
		this.datos = new ListaEnlazadaGenerica<T>();
	}
	
	// Agrega elem a la pila
	public void apilar(T elem) {
		datos.agregarInicio(elem); // Agrega al inicio porque por cómo se manejan las pilas por definicion (FILO)
	}
	
	// Elimina y devuelve el elemento en el tope de la pila (tope de la pila = pos 1).
	public T desapilar() {
		T elem = datos.elemento(1); // La pila es FILO: el primero en desapilarse debe ser el que se encuentra en la pos 1
		datos.eliminarEn(1);
		return elem;
	}

	// Devuelve el elemento en el tope de la pila sin eliminarlo.
	public T tope() {
		return datos.elemento(1);
	}

	// Retorna true si la pila está vacía, false en caso contrario.
	public boolean esVacia(){
		return datos.esVacia();
	}
	
}
