package com.banco.bancobackend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
@Entity
public class Mensaje {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer id_origen;
	private Integer id_destino;
	private String texto;
	private Date fecha;
	@ManyToOne
	private Mensaje mensaje;
	public Mensaje() {
		
	}
	@PrePersist
	private void antesDeGuardar () {
		if(this.fecha == null) {
		this.fecha = new Date();}
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_origen() {
		return id_origen;
	}
	public void setId_origen(Integer id_origen) {
		this.id_origen = id_origen;
	}
	public Integer getId_destino() {
		return id_destino;
	}
	public void setId_destino(Integer id_destino) {
		this.id_destino = id_destino;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Mensaje getMensaje() {
		return mensaje;
	}
	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
