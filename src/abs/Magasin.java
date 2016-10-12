package abs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by NiGHTRiDER on 12/10/16.
 */
public  class Magasin {
  private Map<String, Produit> bac= new HashMap<String, Produit>();
  private FactoryProduit f;

  public Magasin(FactoryProduit f) {
    this.f = f;
  }

  public void ajouterProduit(String name, int anneeDeParution ){
    bac.put(name,f.creerProduit(name , anneeDeParution ));
  }

  public Produit retourneProduit(String name){
    return bac.get(name);
  }
}
