package ejercicio1;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class Ejercicio1_6 {

	public static void main(String[] args) {
		System.out.println("Ingrese un numero");
		Scanner s = new Scanner(System.in);
		Sucesion sucesion = new Sucesion();

		ListaDeEnterosEnlazada resultado = sucesion.calcularSucesion(s.nextInt());
		
		resultado.comenzar();
		ImpresionInversaRecursiva.imprimirInversaRecursiva(resultado, resultado.tamanio());
	}

}
