public class RectangleModel {
  public void RectangleModel_main() {

    Rectangle r1 = new Rectangle();
    System.out.println(r1);


    Rectangle r2 = new Rectangle(5.0);
    System.out.println(r2);


    Rectangle r3 = new Rectangle(4.0, 7.0);
    System.out.println(r3);

    Rectangle r4 = new Rectangle(-2.0, 0);

    System.out.println("Area: " + r3.getArea());
    System.out.println("Perimeter: " + r3.getPerimeter());
    System.out.println("Is square: " + r3.isSquare());

    r3.scale(2.0);
    System.out.println("After scale by 2.0: " + r3);
  }

  public class Rectangle {
    private double width;
    private double height;

    Rectangle() {
      this(1.0, 1.0);
      System.out.println("No arg constructor called");
    }

    Rectangle(double side) {
      this(side, side);
      System.out.println("One arg constructor called");
    }

    Rectangle(double width, double height) {
      System.out.println("Two arg constructor called");
      if (width <= 0 || height <= 0) {
        System.err.println("Dimensions must be positive. Falling back to 1.0 by 1.0");
        this.width = 1.0;
        this.height = 1.0;
      } else {
        this.width = width;
        this.height = height;
      }
    }

    public double getArea() {
      return width * height;
    }

    public double getPerimeter() {
      return 2 * (width + height);
    }

    public boolean isSquare() {
      return width == height;
    }

    public void scale(double factor) {
      if (factor > 0) {
        width *= factor;
        height *= factor;
      } else {
        System.err.println("Scale factor must be positive");
      }
    }

    public String toString() {
      return "Rectangle width=" + width + ", height=" + height;
    }
  }
}
