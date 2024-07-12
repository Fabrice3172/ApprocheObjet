package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {

        for(int i=0; i < 10; i++) {
            System.out.println((i+1));
        }

        System.out.println("---------");

        for(int i=0; i < 11; i++) {
            if (i%2 == 0) System.out.println(i);
        }

        System.out.println("---------");

        for(int i=0; i < 10; i++) {
            if (i%2 != 0) System.out.println(i);
        }

        System.out.println("---------");

        int i =0;
        while (i < 10){
            System.out.println((i+1));
            i++;
        }

        System.out.println("---------");

        int j = 0;
        while (j < 10){
            if (j%2 == 0) System.out.println(j);
            j++;
        }

        System.out.println("---------");

        int k = 0;
        while (k < 10){
            if (k%2 != 0) System.out.println(k);
            k++;
        }

    }
}
