package factory;

import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD extends Magasin{

  @Override Produit creerProduit(String name, int anneeDeParution) {
    return new DVD(name , anneeDeParution);
  }
}
