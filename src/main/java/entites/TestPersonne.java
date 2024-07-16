package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        //p1.nom = "Mazenc";
        //p1.prenom = "Fabrice";
        AdressPostale adr1 = new AdressPostale(40, "Rue du midi",31400,"Toulouse");
        AdressPostale adr2 = new AdressPostale(47, "Route de Villeneuve",9100,"Pamiers");

        Personne p1 = new Personne("Mazenc", "Fabrice", adr1);
        Personne p2 = new Personne("Mazenc","Arnaud", adr2);

        //p1.adr = new AdressPostale();
        p1.adr.libelleDeRue = "Rue du midi";
        p1.adr.codePostal = 31400;
        p1.adr.numeroDeRue = 40;
        p1.adr.ville = "Toulouse";

        p2.nom = "Mazenc";
        p2.prenom = "Arnaud";
        //p2.adr = new AdressPostale();
        p2.adr.libelleDeRue = "Route de Villeneuve";
        p2.adr.codePostal = 9100;
        p2.adr.numeroDeRue = 47;
        p2.adr.ville = "Pamiers";

        p1.afficher(); //40 rue du midi 31400 Toulouse

        p1.modifierAdresse(adr2);

        p1.afficherAdr(); //47 Route de Villeneuve 9100 Pamiers


        Personne p3 = new Personne("Monsieur","Jean");
        p3.afficher();

        System.out.println(p3);
    }

}
