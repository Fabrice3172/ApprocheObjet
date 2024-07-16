package entites;

public class TestEquals {
    public static void main(String[] args) {


        Ville v1 = new Ville("Toulouse", 700000);
        Ville v2 = new Ville("Toulouse", 700000);
        Ville v3 = new Ville("Toulouse", 70000);
        Ville v4 = v3;

        if (v1.equals(v2)) System.out.println("Egal");
        else System.out.println("Diff");
        if (v1.equals(v3)) System.out.println("Egal");
        else System.out.println("Diff");
        if (v1 == v2) System.out.println("Egal");
        else System.out.println("Diff");
        if (v1 == v3) System.out.println("Egal");
        else System.out.println("Diff");
        if (v4 == v3) System.out.println("Egal");
        else System.out.println("Diff");
    }
}
