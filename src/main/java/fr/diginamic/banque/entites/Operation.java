package fr.diginamic.banque.entites;



public abstract class Operation {
    String date;
    double montant;



    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    @Override
    public String toString() {
        return null;
    }

    public abstract String getType();

    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
