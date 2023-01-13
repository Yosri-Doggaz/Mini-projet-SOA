package com.example.demo;

public class requestType {
	public double salaire,mensualite;
	public String typeContrat;
	public boolean bct;
	public Long IdFolder;
	
	
	public Long getIdFolder() {
		return IdFolder;
	}
	public void setIdFolder(Long idFolder) {
		IdFolder = idFolder;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public double getMensualite() {
		return mensualite;
	}
	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public boolean isBct() {
		return bct;
	}
	public void setBct(boolean bct) {
		this.bct = bct;
	}
	
	
	
}
