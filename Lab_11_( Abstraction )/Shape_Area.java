abstract class Shape {

  public abstract double calculateArea();
}

class Circle extends Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
  double width, height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    return width * height;
  }
}

public class Shape_Area {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(4, 6);

    System.out.println("Area of Circle: " + circle.calculateArea());
    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
  }
}
