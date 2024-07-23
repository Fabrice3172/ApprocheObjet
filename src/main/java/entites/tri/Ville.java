package entites.tri;


import java.lang.Comparable;
import java.util.Objects;

public class Ville implements Comparable<Ville> {
//public class Ville implements Comparator<Ville> {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }


//    @Override
//    public int compareTo(Ville o1) {
//        int result = this.nom.compareTo(o1.getNom());
//        return result;
//    }
    @Override
    public int compareTo(Ville o1) {

        if (this .nbHabitants > o1.getNbHabitants()) {
            return 1;
        }
        if (this .nbHabitants < o1.getNbHabitants()) {
            return -1;
        }
        return 0;
    }

//    @Override
//    public int compare(Ville o1, Ville o2) {
//        return -this.nbHabitants.compare();
//    }

    @Override
    public boolean equals(Object objet ) {
        if (!(objet instanceof Ville)) {
            return false;
        }
        Ville other = (Ville) objet;
        return Objects.equals(nom, other.getNom()) && Objects.equals(nbHabitants, other.getNbHabitants());
    }
    
}
