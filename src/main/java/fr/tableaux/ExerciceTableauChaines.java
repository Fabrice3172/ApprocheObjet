package fr.tableaux;

public class ExerciceTableauChaines {

        public static void main(String[] args) {
            String[] s = new String[5];

            s[0] = "Toulouse";
            s[1] = "Montpellier";
            s[2] = "Marseille";
            s[3] = "Paris";

            System.out.println(s[0]);
            System.out.println(s[1]);
            System.out.println(s[2]);
            System.out.println(s[3]);
            System.out.println("Length of s = " + (s.length-1));

            s[3]= "Reims";
            System.out.println(s[0]);
            System.out.println(s[1]);
            System.out.println(s[2]);
            System.out.println(s[3]);
        }
    }
