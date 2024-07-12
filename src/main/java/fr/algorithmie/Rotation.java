package fr.algorithmie;

public class Rotation {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int[] copyArray = new int[17];
        copyArray[0] = array[array.length-1];

        System.out.println("Rotation == ");

        for (int i=1; i < array.length; i++) {
            copyArray[i] = array[i-1];
        }

        for (int i=0; i < array.length; i++) {
            System.out.println(copyArray[i]);
        }

    }

}
