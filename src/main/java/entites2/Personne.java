package entites2;

import entites.AdressPostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressPostale adr;

    public Personne(String nom, String prenom, AdressPostale adr) {
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
    }
}
