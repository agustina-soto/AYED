package ejercicio1;

import tp02.ejercicio1.*;

public class Ejercicio1_6 {

	public static void main(String[] args) {
		Sucesion sucesion = new Sucesion();

		ListaDeEnterosEnlazada resultado = sucesion.calcularSucesion(5);
		
		resultado.comenzar();
		ImpresionInversaRecursiva.imprimirInversaRecursiva(resultado, resultado.tamanio());
	}

}
