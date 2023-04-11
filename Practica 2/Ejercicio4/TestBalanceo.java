/*

	NO FUNCIONA BIEN, A VECES INGRESO UN STRING BALANCEADO Y ME INFORMA QUE NO LO ESTA :(

*/
package tp02.ejercicio4;

import tp02.ejercicio3.PilaGenerica;

public class TestBalanceo {

	public static char getOpuesto(char apertura) {
		switch (apertura) {
			case '(': return ')';
			case '[': return ']';
			case '{': return '}';
			default: return '?'; // No se recibio un caracter valido
		}
	}

	public static boolean esApertura(char car) {
		switch (car) {
			case '(' | '[' | '{': return true; // Si se recibio algun caracter de apertura devuelve true
		}
		return false;
	}

	public static boolean esBalanceado(String st) {
		PilaGenerica<Character> pila = new PilaGenerica<Character>();
		
		// Recorre el string caracter por caracter
		for (char car : st.toCharArray()) { // Devuelve un Array de caracteres después de convertir st en una secuencia de caracteres
			if(st.isEmpty()) return true; // Si el string esta vacio

			if (car == ' ') continue; // Si es un espacio

			if (esApertura(car)) { // Si es un caracter de apertura
				pila.apilar(car);
				continue;
			}
			else // Es un caracter opuesto (de cierre) o uno invalido
			{ 
				if (pila.esVacia()) return false; // El opuesto esta de mas: no hay balance

				char ultimaApertura = pila.desapilar(); // Toma la ultima apertura apilada
				if (car != getOpuesto(ultimaApertura)) { // Si no es el opuesto correcto para la ultima apertura, no esta balanceado
					return false;
				}
			}
		}
		
		// Si la pila no quedo vacia no esta balanceado
		if (!pila.esVacia()) return false;

		// Si llego hasta aca es porque esta balanceado
		return true;
	}

	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("Ingrese un string con los caracteres de apertura y cierre: ( ) [ ] { }");
		}

		boolean balanceado = true;

		for (String st : args) {
			System.out.println("Se ingreso: " + st);
			if (esBalanceado(st)) {
				System.out.println("El string ingresado esta balanceado");
			}
			else {
				System.out.println("El string ingresado no esta balanceado");
			}
		}
	}
}
