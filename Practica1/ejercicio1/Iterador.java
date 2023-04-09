package ejercicio1;

public class Main {

	public static void main (String[] args) {
		int num1 = 1;
		int num2 = 5;

		System.out.println("Iterando con For");
		Iterador.iterarFor(num1, num2);

		System.out.println("Iterando con While");
		Iterador.iterarWhile(num1, num2);

		System.out.println("Iterando Recursivamente");
		Iterador.iterarRecursivo(num1, num2);
		
	}
}
