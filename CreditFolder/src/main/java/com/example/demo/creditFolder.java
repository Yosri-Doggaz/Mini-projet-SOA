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
	private double montant, interet,mensualite,taux;
	private int duree;

	public creditFolder() {
	}
	public creditFolder(Long id, Long idBarem, String clientCin, double montant, double interet, double mensualite, double taux, int duree) {
		this.id = id;
		this.idBarem = idBarem;
		this.clientCin = clientCin;
		this.montant = montant;
		this.interet = interet;
		this.mensualite = mensualite;
		this.taux = taux;
		this.duree = duree;
	}
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

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}



}
