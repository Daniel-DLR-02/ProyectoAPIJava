package controller;

import java.util.List;
import datos.DatosListadosElementosOcio;
import model.*;

//Aquí creo la interfaz funcional que me ayudará a calcular los precios.

@FunctionalInterface //Esta notación me asegura que esta interfaz cumple con los requisitos para ser funcional.
public interface IPrecioServicio {

	public default double cobrarEnvio(Persona p1) {
		if (p1.isSocio())
			return aplicarDescuento(DatosListadosElementosOcio.precioEnvio);
		else
			return DatosListadosElementosOcio.precioEnvio;
	}

	public default double aplicarDescuento(double precioInicial) {
		return precioInicial * ((100-DatosListadosElementosOcio.descuentoParaSocios) / 100);
	}

	public double calcularPrecioDeServicios(List<ElementoDeOcio> ListaServicios);
}

