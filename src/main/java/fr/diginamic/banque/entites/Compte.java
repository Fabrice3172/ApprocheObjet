package fr.diginamic.banque.entites;

public class Compte {

    String numeroDeCompte;
    public double solde;

    public Compte(String numeroDeCompte, double solde) {
        this.numeroDeCompte = numeroDeCompte;
        this.solde = solde;
    }

    public String getNumeroCompte() {
        return numeroDeCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroDeCompte = numeroCompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return this.numeroDeCompte + "   " + this.solde;
    }
}
