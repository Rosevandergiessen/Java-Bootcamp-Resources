import product.Shirt;
import product.Shirt.*;
import product.Pants;

public class Main {

    public static void main(String[] args) {

      Shirt shirt = new Shirt();
      shirt.setSize(Size.SMALL);

      shirt.setBrand("Adidas");
      shirt.setColor("Black");
      shirt.setPrice(50);

      shirt.fold();

      Pants pants = new Pants();
      pants.setWaist(32);
      pants.setLength(32);
      pants.setColor("Black");
      pants.setPrice(100);
      pants.setBrand("Levi's");

      pants.fold();
    }
  }
