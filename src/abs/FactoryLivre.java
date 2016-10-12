package abs;

/**
 * Created by NiGHTRiDER on 12/10/16.
 */
public class FactoryLivre implements FactoryProduit {
  @Override public Produit creerProduit(String n, int a) {
    return new Livre(n,a);
  }
}
