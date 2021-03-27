package ppal;
import java.util.ArrayList;
import java.util.List;
import controller.Leer;
import crud.AdministradorCarrito;
import datos.DatosListadosElementosOcio;
import model.*;
import vista.Mensajes;

public class Principal {


	public static void main(String[] args) {

		int op=0;
		String contraseniaIntroducida,contrasenia="qwerty";
		int codigoProdAniadir;
		
		DatosListadosElementosOcio.listaElementosDeOcio.add(DatosListadosElementosOcio.Halo);
		DatosListadosElementosOcio.listaElementosDeOcio.add(DatosListadosElementosOcio.Pokemon);
		DatosListadosElementosOcio.listaElementosDeOcio.add(DatosListadosElementosOcio.Spiderman);
		DatosListadosElementosOcio.listaElementosDeOcio.add(DatosListadosElementosOcio.Quijote);
		DatosListadosElementosOcio.listaElementosDeOcio.add(DatosListadosElementosOcio.Watchmen);
		DatosListadosElementosOcio.listaElementosDeOcio.add(DatosListadosElementosOcio.Recetas);
		DatosListadosElementosOcio.listaElementosDeOcio.add(DatosListadosElementosOcio.Tenet);
		DatosListadosElementosOcio.listaElementosDeOcio.add(DatosListadosElementosOcio.Lalaland);
		DatosListadosElementosOcio.listaElementosDeOcio.add(DatosListadosElementosOcio.elClubDeLaLucha);
		
		List<ElementoDeOcio> carrito = new ArrayList<ElementoDeOcio>();
		
		Persona p1=new Persona("E324532","434534332","laoha@gmail.com",false,carrito);
		

		Mensajes.darBienvenida();
		
		do {
			Mensajes.mostrarOpciones();
			op=Leer.datoInt();
			
			switch(op) {
				case 1:
					System.out.println("Usted ha elegido ver los objetos en stock ordenados por código.");
					Mensajes.mostrarOrdenadosPorCodigo();
					break;
				case 2:
					if(p1.isSocio())
						System.out.println("Usted ya esta logeado.");
					else {
						System.out.println("Introduzca la contraseña para iniciar sesión:");//Es qwerty
						contraseniaIntroducida=Leer.dato();
						if(contraseniaIntroducida.equals(contrasenia))
							p1.setSocio(true);
						else
							System.out.println("Contraseña incorrecta.");
					}
					break;
				case 3:
					if(!p1.isSocio())
						System.out.println("Usted debe estar logueado para acceder a esta opción.");
					else {
						Mensajes.mostrarOrdenadosPorCodigo();
						System.out.println("Introduzca el código del producto que le gustaría añadir.");
						codigoProdAniadir=Leer.datoInt();
						AdministradorCarrito.aniadirProductoPorCodigo(p1, codigoProdAniadir);
					}
					break;
				case 4:
					if(!p1.isSocio())
						System.out.println("Usted debe estar logueado para acceder a esta opción.");
					else
						Mensajes.mostrarCarrito(p1);
					break;
				case 5:
					if(!p1.isSocio())
						System.out.println("Usted debe estar logueado para acceder a esta opción.");
					else {
						System.out.println("Usted ha decidido ver el precio total del carrito.");
						Mensajes.mostrarPrecioTotalCarrito(p1);
					}
					break;
			
				case 0:
					System.out.println("Usted ha decidido apagar el programa.Apagando...");
					break;
				default:
					System.out.println("Opcion no válida.");
				break;
			}
		}while(op!=0);
	}

}
