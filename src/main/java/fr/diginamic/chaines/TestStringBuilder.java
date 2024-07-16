package fr.diginamic.chaines;

public class TestStringBuilder {


    public static void main(String[] args) {

        String result = "";

        long debut = System.currentTimeMillis();
        for(int i=0; i < 100000; i++) {
            result += i;
        }
        long fin = System.currentTimeMillis();

        System.out.println("Temps CONCAT écoulé en millisecondes :" + (fin - debut));

        StringBuilder result2 = new StringBuilder();

        long debut2 = System.currentTimeMillis();
        for(int i=0; i < 100000; i++) {
            result2.append(i);
        }
        long fin2 = System.currentTimeMillis();

        System.out.println("Temps STRINGBUILDER écoulé en millisecondes :" + (fin2 - debut2));
    }

}
