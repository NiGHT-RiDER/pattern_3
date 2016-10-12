package factory;

public class DVD extends Produit {

  private String name;
  private int anneeDeParution;
  public static final double PRIX=19.99;

  public DVD(String name, int anneeDeParution) {
    super(name , anneeDeParution , PRIX);
  }
}
