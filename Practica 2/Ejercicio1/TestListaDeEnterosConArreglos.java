package ejercicio1;

import tp02.ejercicio1.*;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {

		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();

		for (String st : args)
		{
			lista.agregarFinal(Integer.parseInt(st));
		}

		lista.comenzar();
		while(!lista.fin())
		{
			System.out.print(lista.proximo() + " | ");
		}
	}

}
