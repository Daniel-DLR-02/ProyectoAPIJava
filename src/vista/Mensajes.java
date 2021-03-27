package vista;

import crud.AdministradorDePrecios;
import crud.ComparatorCodigos;
import datos.*;
import model.*;

public class Mensajes {

	public static void darBienvenida() {
		System.out.println("                                                            \n"
				+ "_/||\\__/||\\__/||\\__/||\\__/||\\__/||\\__/||\\__/||\\__/||\\__/||\\_\n"
				+ "\\    /\\    /\\    /\\    /\\    /\\    /\\    /\\    /\\    /\\    /\n"
				+ "/    \\/    \\/    \\/    \\/    \\/    \\/    \\/    \\/    \\/    \\\n"
				+ " \\||/  \\||/  \\||/  \\||/  \\||/  \\||/  \\||/  \\||/  \\||/  \\||/ \n"
				+ "                                                            \n"
				+ " ____  _  _____ _      _     _____ _      _  ____  ____     \n"
				+ "/  __\\/ \\/  __// \\  /|/ \\ |\\/  __// \\  /|/ \\/  _ \\/  _ \\    \n"
				+ "| | //| ||  \\  | |\\ ||| | //|  \\  | |\\ ||| || | \\|| / \\|    \n"
				+ "| |_\\\\| ||  /_ | | \\||| \\// |  /_ | | \\||| || |_/|| \\_/|    \n"
				+ "\\____/\\_/\\____\\\\_/  \\|\\__/  \\____\\\\_/  \\|\\_/\\____/\\____/    \n"
				+ "                                                            \n"
				+ "                                                            \n"
				+ "_/||\\__/||\\__/||\\__/||\\__/||\\__/||\\__/||\\__/||\\__/||\\__/||\\_\n"
				+ "\\    /\\    /\\    /\\    /\\    /\\    /\\    /\\    /\\    /\\    /\n"
				+ "/    \\/    \\/    \\/    \\/    \\/    \\/    \\/    \\/    \\/    \\\n"
				+ " \\||/  \\||/  \\||/  \\||/  \\||/  \\||/  \\||/  \\||/  \\||/  \\||/ \n"
				+ "                                                            ");
	}

	public static void mostrarOpciones() {
		System.out.println("1.-Mostrar objetos en stock ordenados por código.");
		System.out.println("2.-Iniciar sesión.");
		System.out.println("3.-Añadir producto al carrito.");
		System.out.println("4.-Mostrar el carrito.");
		System.out.println("5.-Mostrar el precio total de todo lo del carrito.");
	}

	public static void mostrarOrdenadosPorCodigo() {
		DatosListadosElementosOcio.listaElementosDeOcio.sort(new ComparatorCodigos());
		for (ElementoDeOcio e1 : DatosListadosElementosOcio.listaElementosDeOcio) {
			System.out.println(e1);
		}
	}

	public static void mostrarCarrito(Persona p1) {
		for (ElementoDeOcio e1 : p1.getCarrito())
			System.out.println(e1);
	}

	public static void mostrarPrecioTotalCarrito(Persona p1) {

		System.out.println(
				"El precio total de tu carrito es de: " + AdministradorDePrecios.CalcularPrecioCarrito(p1) + " €");
	}
}
