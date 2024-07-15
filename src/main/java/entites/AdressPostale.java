package entites;

public class AdressPostale {
    public int numeroDeRue;
    public String libelleDeRue;
    public int codePostal;
    public String ville;

    public AdressPostale(int numeroDeRue, String libelleDeRue, int codePostal, String ville) {
        this.numeroDeRue = numeroDeRue;
        this.libelleDeRue = libelleDeRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}


