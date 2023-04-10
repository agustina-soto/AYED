package tp02.ejercicio3;

import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ColaGenerica<T> {
	private ListaGenerica<T> datos;

	public ColaGenerica() {
		this.datos = new ListaEnlazadaGenerica<T>();
		// Instancia una lista enlazada porque la generica es abstracta, no puedo instanciarla ni usar sus metodos
	}
	
	// Agrega elem a la cola
	public void encolar(T elem) {
		datos.agregarFinal(elem);
	}


	/*
	 * CUANDO SE IMPLEMENTA ESTE METODO HAY QUE CONSULTAR SI LA COLA ESTA VACIA
	 */
	// Elimina y devuelve el primer elemento de la cola
	public T desencolar() {
		T elem = datos.elemento(1); // (1) porque siempre desencolo el primero (por definicion de la cola: FIFO)
		datos.eliminarEn(1);
		return elem;
	}
	
	// Devuelve el elemento en el tope de la cola sin eliminarlo.
	public T tope() {
		return datos.elemento(1); // (1) porque siempre desencolo el primero (por definicion de la cola: FIFO)
	}
	
	// Retorna true si la cola está	vacía, false en caso contrario.
	public boolean esVacia() {
		return datos.esVacia();
	}

}
