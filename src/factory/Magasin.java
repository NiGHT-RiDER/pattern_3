package factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by NiGHTRiDER on 12/10/16.
 */
public abstract class Magasin {
  private Map<String, Produit> bac= new HashMap<String, Produit>();

  public void ajouterProduit(String name, int anneeDeParution ){
    bac.put(name,this.creerProduit(name , anneeDeParution ));
  }

  abstract Produit creerProduit(String name, int anneeDeParution );

  public Produit retourneProduit(String name){
    return bac.get(name);
  }
}
