package com.empresa.cmc.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String telefono;
	private String correo;
	private String codigo;
	private InformacionAutentificacion informacionAutentificacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public InformacionAutentificacion getInformacionAutentificacion() {
		return informacionAutentificacion;
	}

	public void setInformacionAutentificacion(InformacionAutentificacion informacionAutentificacion) {
		this.informacionAutentificacion = informacionAutentificacion;
	}

}
