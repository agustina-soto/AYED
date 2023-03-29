package ejercicio5;

public class CalculadoraA {

	public static Datos calcularMaxMinProm(int[] arreglo) {
		
		int min = 999, max = -1, suma = 0, tam = arreglo.length;
		
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] < min) min = arreglo[i];
			if (arreglo[i] > max) max = arreglo[i];
			suma += arreglo[i];
		}

		Datos datos = new Datos();
		
		datos.setMin(min);
		datos.setMax(max);
		datos.setPromedio((float) suma / tam);

		return datos;
	}

}
