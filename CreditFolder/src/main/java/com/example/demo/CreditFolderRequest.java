package com.example.demo;

public class CreditFolderRequest {
    private long idBarem;
    private String  idClient;
    private double montant;
    private int duree;
    private double taux;

    public CreditFolderRequest(long idBarem, String idClient, double montant, int duree,double taux) {
        this.idBarem = idBarem;
        this.idClient = idClient;
        this.montant = montant;
        this.duree = duree;
        this.taux = taux;
    }

    public CreditFolderRequest() {
    }

    public long getIdBarem() {
        return idBarem;
    }

    public void setIdBarem(long idBarem) {
        this.idBarem = idBarem;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
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
