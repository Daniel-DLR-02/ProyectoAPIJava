package model;

public class Videojuego extends ElementoDeOcio {

	/*
	 * Esta clase hereda de Elemento de ocio.Sirve para especificar lo que va a ser
	 * el objeto Videojuego en el programa y de lo que consta.
	 */
	private String consolaCompatible, fechaSalida, genero, desarrolladora;
	private int valoracionEnEstrellas;

	public Videojuego(String titulo, int numeroLikes, int codigo, String consolaCompatible, String fechaSalida,
			String genero, String desarrolladora, int valoracionEnEstrellas) {
		super(titulo, numeroLikes, codigo);
		this.consolaCompatible = consolaCompatible;
		this.fechaSalida = fechaSalida;
		this.genero = genero;
		this.desarrolladora = desarrolladora;
		this.valoracionEnEstrellas = valoracionEnEstrellas;
	}

	public String getConsolaCompatible() {
		return consolaCompatible;
	}

	public void setConsolaCompatible(String consolaCompatible) {
		this.consolaCompatible = consolaCompatible;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDesarrolladora() {
		return desarrolladora;
	}

	public void setDesarrolladora(String desarrolladora) {
		this.desarrolladora = desarrolladora;
	}

	public int getValoracionEnEstrellas() {
		return valoracionEnEstrellas;
	}

	public void setValoracionEnEstrellas(int valoracionEnEstrellas) {
		this.valoracionEnEstrellas = valoracionEnEstrellas;
	}

}
