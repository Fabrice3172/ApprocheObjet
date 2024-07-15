package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte unCompte = new Compte(1234, Integer.MAX_VALUE);

        System.out.println(unCompte.getSolde() + "    " + unCompte.getNumeroCompte());
    }
}
