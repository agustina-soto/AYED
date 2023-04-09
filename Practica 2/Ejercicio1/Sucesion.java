package ejercicio1;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class Sucesion {

	private ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();	
	
	public ListaDeEnterosEnlazada getLista() {
		return lista;
	}


	public boolean esPar (int n) {
		return ((n % 2) == 0);
	}
	
	/* Metodo recursivo que a partir de un número n devuelve una lista con cada miembro de la sucesión */
	public ListaDeEnterosEnlazada calcularSucesion (int n)
	{
		if (n != 1)
		{
			if (esPar(n))
			{
				calcularSucesion(n/2);
			}
			else
			{
				calcularSucesion((3*n) + 1);
			}
		}
		this.lista.agregarFinal(n);
		return this.getLista();
	}
}
