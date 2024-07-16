package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
       // Compte unCompte = new Compte("G1234", Integer.MAX_VALUE);

       // System.out.println(unCompte.getSolde() + "    " + unCompte.getNumeroCompte());

        Compte[] tableauComptes = {new Compte("G1234", Integer.MAX_VALUE),  new CompteTaux("G1234", Integer.MAX_VALUE, 50)};

       // tableauComptes[0] = new Compte("G1234", Integer.MAX_VALUE);

       // tableauComptes[1] = new CompteTaux("G1234", Integer.MAX_VALUE, 50);

        for (int i=0; i < tableauComptes.length; i++){
            System.out.println("tab" + i + " : " + tableauComptes[i]);
            //System.out.println("tab[1] : " + tableauComptes[1]);
        }
    }
}
