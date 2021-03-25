package model;

public class Pelicula extends ElementoDeOcio {

	/*
	 * Esta clase heredará de ElementoDeOcio.En esta clase defino lo que será el
	 * objeto Pelicula. Con sus correspondientes getters and setters.
	 */

	private String director, genero, fechaDeEstreno;
	private int duracionEnMin;

	public Pelicula(String titulo, int numeroLikes, int codigo, String director, String genero, String fechaDeEstreno,
			int duracionEnMin) {
		super(titulo, numeroLikes, codigo);
		this.director = director;
		this.genero = genero;
		this.fechaDeEstreno = fechaDeEstreno;
		this.duracionEnMin = duracionEnMin;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFechaDeEstreno() {
		return fechaDeEstreno;
	}

	public void setFechaDeEstreno(String fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
	}

	public int getDuracionEnMin() {
		return duracionEnMin;
	}

	public void setDuracionEnMin(int duracionEnMin) {
		this.duracionEnMin = duracionEnMin;
	}

}
