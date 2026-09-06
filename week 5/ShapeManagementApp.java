class Shape {
    String color;
    Shape(){
        color = "Red";
    }
    Shape(String color) 
    {
        this.color = color;
    }
    double area(int r) 
    {
        return 3.14 * r * r;
    }
    double area(int l, int b) {
        return l * b;
    }
    double area(int b, int h, char t) 
    { return 0.5 * b * h;
    }
}
class Circle extends Shape {
    int radius;
    Circle(int radius) {
        super("Red");
        this.radius = radius;
    }
    double getArea() {
        return area(radius);
    }
}
class Rectangle extends Shape {
    int length;
    int breadth;
    Rectangle(int length, int breadth) {
        super("Blue");
        this.length = length;
        this.breadth = breadth;
    }
    double getArea() {
        return area(length, breadth);
    }
}
class Triangle extends Shape {
    int base;
    int height;
    Triangle(int base, int height) {
        super("Green");
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return area(base, height, 'T');
    }
}
public class ShapeManagementApp {
    public void ShapeManagementApp_main() {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 6);
        System.out.println("Circle Area = " + c.getArea());
        System.out.println("Rectangle Area = " + r.getArea());
        System.out.println("Triangle Area = " + t.getArea());
        double total = c.getArea() + r.getArea() + t.getArea();
        System.out.println("Total Area = " + total);
        System.out.println("Average Area = " + total / 3);
    }
}
