package ejercicio5;

public class Main {

	public static void main(String[] args) {

		int[] numeros = {12, 3, 5, 3, 8, -4};

		Datos maxMinProm = CalculadoraA.calcularMaxMinProm(numeros);
		System.out.println("El máximo es " + maxMinProm.getMax());
		System.out.println("El mínimo es " + maxMinProm.getMin());
		System.out.println("El promedio es " + maxMinProm.getPromedio());

		Datos datos = new Datos();
		CalculadoraB.calcularMaxMinProm(numeros, datos);
		System.out.println("El máximo es " + maxMinProm.getMax());
		System.out.println("El mínimo es " + maxMinProm.getMin());
		System.out.println("El promedio es " + maxMinProm.getPromedio());

		CalculadoraC.calcularMaxMinProm(numeros);
		System.out.println("El máximo es " + maxMinProm.getMax());
		System.out.println("El mínimo es " + maxMinProm.getMin());
		System.out.println("El promedio es " + maxMinProm.getPromedio());
	}

}
