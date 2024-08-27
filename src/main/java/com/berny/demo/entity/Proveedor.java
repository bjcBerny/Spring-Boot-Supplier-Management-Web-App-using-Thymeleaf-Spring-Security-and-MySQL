package com.berny.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "prov_id")
	private Long id;
	
	@Column(name = "prov_raz_social")
	private String razonsocial;
	
	@Column(name = "prov_ruc")
	private String ruc;
	
	@Column(name = "prov_direccion")
	private String direccion;
	
	@Column(name = "prov_telf")
	private String telefono;
	
	@Column(name = "prov_contacto")
	private String nom_contacto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNom_contacto() {
		return nom_contacto;
	}

	public void setNom_contacto(String nom_contacto) {
		this.nom_contacto = nom_contacto;
	}
	
	
}
