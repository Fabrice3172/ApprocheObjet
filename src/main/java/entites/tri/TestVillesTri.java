package entites.tri;


import java.util.ArrayList;
import java.util.Collections;

public class TestVillesTri {
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

        Collections.sort(aV);
        System.out.println(aV);


    }
}
