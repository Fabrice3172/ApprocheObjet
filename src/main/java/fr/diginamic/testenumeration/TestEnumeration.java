package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {
        Saison[] s = Saison.values();
        String nom = "ETE";
        String libelle = "Hiver";

        for(Saison t : s) {
            System.out.println(t.getNom() + t.getNumeroOrdre());

            if (t.getNom().toUpperCase().equals(nom)) System.out.println("ETE : "+t.getNom());

            if (t.getNom().equals(libelle)) System.out.println("EXo2 :" + t.getSaison(libelle));

           // System.out.println(Saison.valueOf(libelle));

        }


    }
}
