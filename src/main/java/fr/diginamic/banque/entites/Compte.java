package fr.diginamic.banque.entites;

public class Compte {

    String numeroCompte;
    public int solde;

    public Compte(String numeroCompte, int solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return this.numeroCompte + "   " + this.solde;
    }
}
