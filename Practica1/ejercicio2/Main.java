package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingrese un numero");
		Scanner scanner = new Scanner(System.in) ;

		int[] arreglo = multiplos(scanner.nextInt());
		imprimirArreglo(arreglo);
	}

	public static int[] multiplos(int n) {
		int[] arreglo = new int[n];
		for (int i = 0; i < n; i++) {
			arreglo[i] = n * (i + 1);
		}
		return arreglo;
	}

	public static void imprimirArreglo(int[] arreglo) {
		int n = arreglo.length;
		System.out.println("\nLos " + n + " primeros multiplos enteros de " + n);
		System.out.println("-------------------");
		for (int i = 0; i < n; i++) {
			System.out.print(arreglo[i] + " | ");
		}
		System.out.println("\n-------------------");
	}
	
}
