public class ProductInventory {
  public void ProductInventory_main() {
    Product p1 = new Product("P1", "Laptop", 1000.0);
    Product p2 = new Product("P2", "Mouse", 25.0, 50);

    System.out.println(p1);
    System.out.println(p2);

    System.out.println("\nTotal products: " + Product.getProductCount());

    p1.restock(10);
    System.out.println(p1);

    System.out.println("\nSelling 5 from p1: " + p1.sell(5));
    System.out.println("Selling 10 from p1: " + p1.sell(10));

    System.out.println("\nInventory Value of p2: " + p2.getInventoryValue());
  }

  public class Product {
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;
    private static int productCount = 0;

    Product(String code, String name, double unitPrice) {
      this(code, name, unitPrice, 0);
    }

    Product(String code, String name, double unitPrice, int quantity) {
      this.code = code;
      this.name = name;

      if (unitPrice > 0) {
        this.unitPrice = unitPrice;
      } else {
        System.err.println("Price must be positive");
        this.unitPrice = 1.0;
      }

      if (quantity >= 0) {
        this.quantity = quantity;
      } else {
        System.err.println("Quantity cannot be negative");
        this.quantity = 0;
      }
      productCount++;
    }

    public boolean restock(int amount) {
      if (amount <= 0) return false;
      quantity += amount;
      return true;
    }

    public boolean sell(int amount) {
      if (amount <= 0 || amount > quantity) return false;
      quantity -= amount;
      return true;
    }

    public double getInventoryValue() {
      return unitPrice * quantity;
    }

    public static int getProductCount() {
      return productCount;
    }

    public String toString() {
      return "Product code=" + code + ", name=" + name + ", price=" + unitPrice + ", qty=" + quantity;
    }
  }
}
