package abs;


public class FactoryDVD implements FactoryProduit {

  @Override public Produit creerProduit(String n, int a) {
    return new DVD(n , a );
  }
}
