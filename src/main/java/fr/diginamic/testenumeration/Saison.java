package fr.diginamic.testenumeration;

import javax.net.ssl.HostnameVerifier;

public enum Saison {

        PRINTEMPS ("Printemps",1),
        ETE("Ete",2),
        AUTOMNE("Automne",3),
        HIVER ("Hiver",4);

        private String nom;
        private int numeroOrdre;

        private Saison(String nom,int numeroOrdre) {
                this.nom = nom;
                this.numeroOrdre = numeroOrdre;
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public int getNumeroOrdre() {
                return numeroOrdre;
        }

        public void setNumeroOrdre(int numeroOrdre) {
                this.numeroOrdre = numeroOrdre;
        }

        public Saison getSaison(String nom) {

                for (Saison s: Saison.values()) {
                        if (s != null)
                                if (s.getNom().equals(nom)) return s;
                }


//                switch (nom) {
//                        case "PRINTEMPS" : return PRINTEMPS.getSaison("Printemps");
//                        //break;
//                        case "ETE" : return ETE.getSaison("Ete");
//                        //break;
//                        case "AUTOMNE" : return AUTOMNE.getSaison("Automne");
//                        //break;
//                        case "HIVER" : return HIVER.getSaison("Hiver");
//                        //break;
//                };
                return null;
        }
}
