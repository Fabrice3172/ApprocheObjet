package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    String numeroDeCompte;
    double solde;
    double taux;

    public CompteTaux(String numeroDeCompte, double solde, double taux) {
        super(numeroDeCompte,solde);

        //this.numeroDeCompte = numeroDeCompte;
        //this.solde = solde;
        this.taux = taux;
    }

    @Override
    public String toString() {
        //return "numeroDeCompte='" + numeroDeCompte + '\'' +
          //      ", solde=" + solde +
            //    ", taux=" + taux +
              //  '}';

        return super.toString() + "  taux = " + this.taux;

    }
}
