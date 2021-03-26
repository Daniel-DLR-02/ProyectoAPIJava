package controller;

import java.util.List;
import datos.DatosListadosElementosOcio;
import model.*;

@FunctionalInterface
public interface IPrecioServicio {

	public default double cobrarEnvio(Persona p1) {
		if (p1.isSocio())
			return aplicarDescuento(DatosListadosElementosOcio.precioEnvio);
		else
			return DatosListadosElementosOcio.precioEnvio;
	}

	public default double aplicarDescuento(double precioInicial) {
		return precioInicial * (DatosListadosElementosOcio.descuentoParaSocios / 100);
	}

	public double calcularPrecioDeServicios(List<ElementoDeOcio> ListaServicios);
}
