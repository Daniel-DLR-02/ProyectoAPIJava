package model;

public class Libro extends ElementoDeOcio {

	/*
	 * Esta clase consta con la especificaci�n de lo que es el objeto Libro en el
	 * sistema, este objeto hereda de ElementoDeOcio
	 */

	private String autor, genero, fechaDeEstreno;
	private int numeroPaginas;

	public Libro(String titulo, int numeroLikes, int codigo, String autor, String genero, String fechaDeEstreno,
			int numeroPaginas) {
		super(titulo, numeroLikes, codigo);
		this.autor = autor;
		this.genero = genero;
		this.fechaDeEstreno = fechaDeEstreno;
		this.numeroPaginas = numeroPaginas;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
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

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Código=" + getCodigo() + ", Título= " + getTitulo() + ", Autor=" + autor + ", Género=" + genero
				+ ", Fecha de estreno=" + fechaDeEstreno + ", Número de páginas=" + numeroPaginas + ", Likes="
				+ getNumeroLikes();
	}

}
