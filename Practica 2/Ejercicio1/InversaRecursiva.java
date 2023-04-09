package tp02.ejercicio1;

public class InversaRecursiva {

	public static void main(String[] args) {
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
	
		for (String st : args)
		{
			lista.agregarFinal(Integer.parseInt(st));
		}
		
		imprimirInversaRecursiva(lista, lista.tamanio());
	}

	/* Metodo recursivo que imprime los elementos de una lista en sentido inverso.
	 * La lista se recibe como parametro junto con la ultima posicion ocupada.
	 * El primer elemento de la lista esta en posicion 1. pos = 1 --> caso base. */
	public static void imprimirInversaRecursiva(ListaDeEnteros lista, int pos)
	{
		System.out.print(lista.elemento(pos) + " | "); // Imprime el ultimo elemento
		if (pos > 1) // Contra 1 porque no quiero que haga --pos e intente imprimir en lista[0]
		{
			imprimirInversaRecursiva(lista, --pos);
		}
	}

}
