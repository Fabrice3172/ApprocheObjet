package fr.algorithmie;

import java.sql.SQLOutput;

public class InversionContenu {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int[] arrayCopy = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("arrayCopy"+"   "+"array");
        for(int i= array.length-1; i >=0 ; i--) {
            arrayCopy[i] = array[array.length-i-1];

            System.out.print(arrayCopy[i]);
            System.out.println("           " + array[i]);
        }

    }

}
