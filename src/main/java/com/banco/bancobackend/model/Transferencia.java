package com.banco.bancobackend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Transferencia {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer id_ordenante;
	private Integer id_beneficiario;
	private double importe;
	private String concepto;
	private Date fecha;;
	public Transferencia() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_ordenante() {
		return id_ordenante;
	}
	public void setId_ordenante(Integer id_ordenante) {
		this.id_ordenante = id_ordenante;
	}
	public Integer getId_beneficiario() {
		return id_beneficiario;
	}
	public void setId_beneficiario(Integer id_beneficiario) {
		this.id_beneficiario = id_beneficiario;
	}
	
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
  
}
