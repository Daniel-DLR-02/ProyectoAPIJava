package model;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	String nombre, apellidos, id, numeroTelefono, email;
	boolean socio;
	List<ElementoDeOcio> carrito = new ArrayList<ElementoDeOcio>();

	public Persona(String nombre, String apellidos, String id, String numeroTelefono, String email, boolean socio,
			List<ElementoDeOcio> carrito) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.numeroTelefono = numeroTelefono;
		this.email = email;
		this.socio = socio;
		this.carrito = carrito;
	}

	public List<ElementoDeOcio> getCarrito() {
		return carrito;
	}

	public void setCarrito(List<ElementoDeOcio> carrito) {
		this.carrito = carrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isSocio() {
		return socio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}

}
