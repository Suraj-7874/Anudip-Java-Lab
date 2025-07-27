class Shape {
    public double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

   
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    int length;

    Square(int length) {
        this.length = length;
    }

   
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    public double getArea() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(4);
        Rectangle r = new Rectangle(6, 3);

        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Square: " + s.getArea());
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}
