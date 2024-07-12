package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5;
        double f = 6;
        char g = '7';
        boolean h = true;
        String s = "OK";

        System.out.println("a"+a+"\n"+"b"+b+"\n"+"c"+c+"\n"+"d"+d+"\n"+"e"+e+"\n"+"f"+f+"\n"+"g"+g+"\n"+"h"+h+"\n"+s);

        String randomString = "Voici le résultat d’un calcul : \n 1+5=6";
        System.out.println("Random : "+ randomString);
    }
}
