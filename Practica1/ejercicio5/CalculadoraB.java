package ejercicio5;

public class CalculadoraB {

	public static void calcularMaxMinProm(int[] arreglo, Datos datos) {

		int min = 999, max = -1, suma = 0, tam = arreglo.length;

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] < min)
				min = arreglo[i];
			if (arreglo[i] > max)
				max = arreglo[i];
			suma += arreglo[i];
		}

		datos.setMin(min);
		datos.setMax(max);
		datos.setPromedio((float) suma / tam);

	}
}
