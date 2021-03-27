package datos;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class DatosListadosElementosOcio {
	
	public static List<ElementoDeOcio> listaElementosDeOcio = new ArrayList<ElementoDeOcio>();

	public static ElementoDeOcio Halo=new Videojuego("Halo Infinite",10000,2414526,"Xbox one/series x y Pc","21/10/2020","shooter","343 industries",4);
	public static ElementoDeOcio Pokemon=new Videojuego("Pokemon diamante y perla REMAKE",89433,5434624,"Nintendo switch","12/4/2020","RPG","GAME FREAK",3.8);
	public static ElementoDeOcio Spiderman=new Videojuego("Spiderman",675678,1234155,"Play station 4/Play station 5","13/01/2019","Acción y aventuras","Imsomniac games",4.8);
	
	public static ElementoDeOcio Quijote=new Libro("El ingenioso hidalgo don Quijote de la Mancha",102043,6355432,"Miguel de Cervantes","de 1605","Novela",1345);
	public static ElementoDeOcio Watchmen=new Libro("Watchmen",70432,9432853,"Alan Moore","17 de julio de 2008","Cómic",288);
	public static ElementoDeOcio Recetas=new Libro("La buena cocina: 900 recetas que siempre salen bien",60434,4345324,"Karlos Arguiñano","10 de noviembre de 2020","Cocina",1656);
	
	public static ElementoDeOcio Tenet =new Pelicula("Tenet",32434,0435325,"Christopher Nolan","Acción","12 de agosto de 2020",150);
	public static ElementoDeOcio Lalaland=new Pelicula("Lalaland",53425,4324564,"Damien Chazelle","Musical","13 de enero de 2017",128);
	public static ElementoDeOcio elClubDeLaLucha =new Pelicula("El club de la lucha",525242,3554536,"David Fincher","Thriller","5 de noviembre de 1999",151);
	
	public static double precioComprarUnLibro = 10;
	public static double precioComprarUnaPelicula = 13;
	public static double precioComprarUnVideojuego = 60;
	public static double precioEnvio = 7.50;
	public static double descuentoParaSocios = 20;
}
