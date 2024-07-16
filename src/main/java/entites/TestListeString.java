package entites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class TestListeString {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Nice");
        liste.add("Carcassonne");liste.add("Narbonne");liste.add("Lyon");liste.add("Foix");liste.add("Pau");
        liste.add("Marseille");liste.add("Tarbes");

        int max = 0;
        String maxLettres = "";
        for (String l : liste){
            if (max < l.length()) {
                max = l.length();
            }
        }
        System.out.println(max);
        Iterator<String> it = liste.iterator();
        while (it.hasNext()) {
            String l = it.next();
            if (Objects.equals(l.length(), max)) System.out.println(l);
        }

        int ii=0;
        Iterator<String> it2 = liste.iterator();
        while (it2.hasNext()) {
            String ll = it2.next();
            String ll2 = ll.toUpperCase();
            liste.set(ii,ll2);
            ii++;
        }

        System.out.println("---------------");
        for(String l:liste) {
            System.out.println(l);
        }

        System.out.println("---------------");

        Iterator<String> it3 = liste.iterator();
        while (it3.hasNext()) {
            String ll = it3.next();
            if (ll.startsWith("N")) it3.remove();
        }

        for(String l:liste) {
            System.out.println(l);
        }


    }
}
