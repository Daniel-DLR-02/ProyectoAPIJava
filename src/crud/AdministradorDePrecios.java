package crud;

import java.util.List;
import controller.IPrecioServicio;
import datos.DatosListadosElementosOcio;
import model.*;

public class AdministradorDePrecios {

	public static double CalcularPrecioCarrito(Persona p1) {

		IPrecioServicio calcularCarrito = (List<ElementoDeOcio> le1) -> {
			double totalCompra = 0;
			for (ElementoDeOcio e1 : le1) {
				if (e1 instanceof Pelicula)
					totalCompra += DatosListadosElementosOcio.precioComprarUnaPelicula;
				else if (e1 instanceof Libro)
					totalCompra += DatosListadosElementosOcio.precioComprarUnLibro;
				else if (e1 instanceof Videojuego)
					totalCompra += DatosListadosElementosOcio.precioComprarUnVideojuego;
			}
			return totalCompra;
		};

		return calcularCarrito.calcularPrecioDeServicios(p1.getCarrito())+calcularCarrito.cobrarEnvio(p1);
	}
}
