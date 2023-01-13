package tn.isi.RequestManagment.models;


import jakarta.persistence.*;

@Entity
public class Request {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="request_id")
    private long request_id;

    @Column(name="montant")
    private double montant;

    @Column(name="duree")
    private int duree;

    @Column(name="client_id")
    private int client_id;

    public Request(long request_id, double montant, int duree, int client_id) {
        this.request_id = request_id;
        this.montant = montant;
        this.duree = duree;
        this.client_id = client_id;
    }
    public Request() {

    }

    public long getRequest_id() {
        return request_id;
    }

    public void setRequest_id(long request_id) {
        this.request_id = request_id;
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

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }
}
