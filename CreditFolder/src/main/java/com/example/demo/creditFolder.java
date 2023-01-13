package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class creditFolder {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idBarem;
	private String clientCin;
	private double montant, interet,mensualite;
	private int duree;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdBarem() {
		return idBarem;
	}
	public void setIdBarem(Long idBarem) {
		this.idBarem = idBarem;
	}
	public String getClientCin() {
		return clientCin;
	}
	public void setClientCin(String clientCin) {
		this.clientCin = clientCin;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getInteret() {
		return interet;
	}
	public void setInteret(double interet) {
		this.interet = interet;
	}
	public double getMensualite() {
		return mensualite;
	}
	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
	
}
