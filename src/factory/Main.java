package factory;

/**
 * Created by NiGHTRiDER on 12/10/16.
 */
public class Main {

  public static void main(String[] args) {
    Magasin livre = new MagasinDeLivre();
    livre.ajouterProduit("aa" , 2000);
    livre.ajouterProduit("ba" , 3000);
    livre.ajouterProduit("ca" , 4000);

    Magasin dvd = new MagasinDeDVD();
    dvd.ajouterProduit("az" , 2000);
    dvd.ajouterProduit("bz" , 3000);
    dvd.ajouterProduit("cz" , 4000);

    System.out.println(livre.retourneProduit("aa"));
    System.out.println(livre.retourneProduit("ba"));
    System.out.println(livre.retourneProduit("ca"));

    System.out.println("");

    System.out.println(dvd.retourneProduit("az"));
    System.out.println(dvd.retourneProduit("bz"));
    System.out.println(dvd.retourneProduit("cz"));


  }
}
