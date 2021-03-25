package model;

public class ElementoDeOcio {

	/*
	 * Creo una clase que me sirva para poder tener todos los elementos de ocio del
	 * sistema como un mismo tipo,de este heredarán las demás
	 * clases(Videojuego,Película,Libro)
	 */

	private String titulo;
	private int numeroLikes;
	private int codigo;

	public ElementoDeOcio(String titulo, int numeroLikes, int codigo) {
		this.titulo = titulo;
		this.numeroLikes = numeroLikes;
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroLikes() {
		return numeroLikes;
	}

	public void setNumeroLikes(int numeroLikes) {
		this.numeroLikes = numeroLikes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
