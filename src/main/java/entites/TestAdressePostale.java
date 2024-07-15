package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressPostale adr1 = new AdressPostale();
        AdressPostale adr2 = new AdressPostale();
        adr1.libelleDeRue = "Rue du midi";
        adr1.codePostal = 31400;
        adr1.numeroDeRue = 40;
        adr1.ville = "Toulouse";

        adr2.libelleDeRue = "Route de Villeneuve";
        adr2.codePostal = 9100;
        adr2.numeroDeRue = 47;
        adr2.ville = "Pamiers";


    }
}
