package factory;

import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre extends Magasin{

  @Override Produit creerProduit(String name, int anneeDeParution) {
    return new Livre(name , anneeDeParution);
  }
}
