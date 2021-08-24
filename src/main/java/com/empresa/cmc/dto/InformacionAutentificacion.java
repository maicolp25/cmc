package com.empresa.cmc.dto;

import java.io.Serializable;

public class InformacionAutentificacion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dia;
	private String hora;
	private String numeroIntentos;

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNumeroIntentos() {
		return numeroIntentos;
	}

	public void setNumeroIntentos(String numeroIntentos) {
		this.numeroIntentos = numeroIntentos;
	}

}
