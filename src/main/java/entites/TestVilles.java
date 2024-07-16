package entites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> aV = new ArrayList<>();
        aV.add(new Ville("Nice", 343000));
        aV.add(new Ville("Carcassonne", 47800));
        aV.add(new Ville("Narbonne", 53400));
        aV.add(new Ville("Lyon", 484000));
        aV.add(new Ville("Foix", 9700));
        aV.add(new Ville("Pau", 77200));
        aV.add(new Ville("Marseille", 850700));
        aV.add(new Ville("Tarbes", 40600));

        double max = 0;
        int jj=0;
        Ville vv = new Ville("",0);
        for (Ville v: aV){
            if (max < v.getNbHabitants()) {
                max = v.getNbHabitants();
                vv.setNom(v.getNom());
                vv.setNbHabitants(v.getNbHabitants());
            }
            jj++;

        }
        System.out.println("MAX Habitants =   " + vv.toString());

        Iterator<Ville> it = aV.iterator();
        Ville vvv = aV.get(0);
        double min = vvv.getNbHabitants();
        while (it.hasNext()) {
            Ville l = it.next();
            if (l.getNbHabitants() < vvv.getNbHabitants()) vvv=l;
        }
        System.out.println("min Habitants =   " + vvv.toString());
        aV.remove(vvv);
        for (int i=0; i< aV.size(); i++) {
            System.out.println(aV.get(i).toString());
        }

        System.out.println("-----------------------");
        int ii=0;
        Ville ll2 = new Ville("",0);
        Iterator<Ville> it2 = aV.iterator();
        while (it2.hasNext()) {
            Ville ll = it2.next();
            if (ll.getNbHabitants() > 100000) ll.setNom(ll.getNom().toUpperCase());
        }
        for (int i=0; i< aV.size(); i++) {
            System.out.println(aV.get(i).toString());
        }
    }
}
