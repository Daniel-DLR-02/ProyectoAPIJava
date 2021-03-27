package crud;
import java.util.Iterator;
import datos.*;
import model.*;

public class AdministradorCarrito implements Iterator<ElementoDeOcio>{

	public static void aniadirProductoPorCodigo(Persona p1,int cod) {
		
		Iterator<ElementoDeOcio> it1 =DatosListadosElementosOcio.listaElementosDeOcio.iterator();
		boolean elementoEncontrado=false;
		while(it1.hasNext() && !elementoEncontrado) {
			ElementoDeOcio EDOBuscado=it1.next();
			if(EDOBuscado.getCodigo()==cod) {
				elementoEncontrado=true;
				p1.aniadirAlCarrito(EDOBuscado);
			}
			else if(!it1.hasNext())
				System.out.println("Elemento no encontrado.");	
		}
	
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ElementoDeOcio next() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
