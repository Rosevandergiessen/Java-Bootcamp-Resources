import product.Shirt;
import product.Shirt.*;
import product.Pants;
import product.Product;

public class Main {

    public static void main(String[] args) {

      Shirt shirt = new Shirt(40, "Black", "Armed Angels", Size.SMALL);

      Pants pants = new Pants(130, "Black", "levi's", 32, 32);

      productStore(pants);

    }

    public static void productStore(Product product) {
      System.out.println("Thank you for purchasing the " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ".");
      product.wear();
    }

  }
