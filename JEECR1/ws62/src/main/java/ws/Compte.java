package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;


    public Compte(){

    }
    public Compte(int code,double solde,Date dateCreation){
        this.code=code;
        this.solde=solde;
        this.dateCreation=dateCreation;
    }
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
