package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        Personne p2 = new Personne();

        p1.nom = "Mazenc";
        p1.prenom = "Fabrice";
        p1.adr = new AdressPostale();
        p1.adr.libelleDeRue = "Rue du midi";
        p1.adr.codePostal = 31400;
        p1.adr.numeroDeRue = 40;
        p1.adr.ville = "Toulouse";

        p2.nom = "Mazenc";
        p2.prenom = "Arnaud";
        p2.adr = new AdressPostale();
        p2.adr.libelleDeRue = "Route de Villeneuve";
        p2.adr.codePostal = 9100;
        p2.adr.numeroDeRue = 47;
        p2.adr.ville = "Pamiers";

    }

}
