package entites2;

import entites.AdressPostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressPostale adr;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressPostale adr) {
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
    }



    public void afficher() {

        nom = nom.toUpperCase();
        System.out.println("nom = "+ this.nom + "    prénom = " + this.prenom);
    }

    public void afficherAdr() {
        System.out.println("Adresse = "+ this.adr.numeroDeRue + "  " + this.adr.libelleDeRue + "  " + this.adr.codePostal + "  " + this.adr.ville);

    }
    public void modifierNom(String nom) {
        this.nom = nom;
    }

    public void modifierPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void modifierAdresse(AdressPostale adr) {
        this.adr = adr;
    }

    public String retournerNom(){
        return this.nom;
    }
    public String retournerPrenom(){
        return this.prenom;
    }

    public AdressPostale retournerAdr() {
        return this.adr;
    }
}
