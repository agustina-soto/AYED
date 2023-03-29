package ejercicio5;

public class CalculadoraC {
	private static Datos datos = new Datos();
	// es static para que se pueda acceder a "datos" sin crear una instancia de Calculadora

	public Datos getDatos() {
		return datos;
	}

	public static void setDatos(int min, int max, float prom) {
		datos.setMin(min);
		datos.setMax(max);
		datos.setPromedio(prom);
	}

	public static void calcularMaxMinProm(int[] arreglo) {

		int min = 999, max = -1, suma = 0, tam = arreglo.length;

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] < min)
				min = arreglo[i];
			if (arreglo[i] > max)
				max = arreglo[i];
			suma += arreglo[i];
		}
		setDatos(min, max, (float)suma/tam);
	}

}
