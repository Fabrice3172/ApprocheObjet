package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;
public class TestOperation {

    public static void main(String[] args) {
        //Operation[][] Operation = new Operation[0][];
        Operation[] operations = new Operation[4];

        double montant_total=0;

        operations[0] = new Credit("aujourdhui",100);
        operations[1] = new Credit("aujourdhui",200);
        operations[2] = new Debit("aujourdhui",100);
        operations[3] = new Debit("aujourdhui",100);

        /*for (int i=0; i< operations.length; i++) {
            operations[i].solde = 0;
        }*/

        for(int i=0; i< operations.length; i++){
            System.out.println(operations[i]);
            System.out.println("Solde : " + operations[i].getMontant());
        }

        for(int i=0; i< operations.length; i++){
            if (operations[i].getType().equals("CREDIT")) montant_total+=operations[i].getMontant();
            else if (operations[i].getType().equals("DEBIT")) montant_total-=operations[i].getMontant();
        }
        System.out.println("montant total : " + montant_total);
    }
}
