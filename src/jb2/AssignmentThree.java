package jb2;

interface Shape {
    double calculateArea();

    void display();
}

class Rectangle implements Shape {
    double length;
    double height;

    public Rectangle(double l, double h) {
        length = l;
        height = h;
    }

    public Rectangle(double side) {
        this(side, side);
    }

    @Override
    public double calculateArea() {
        return length * height;
    }

    @Override
    public void display() {
        System.out.println("The area of this rectangle (length * height) is " + calculateArea());
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void display() {
        System.out.println("The area of this circle (\u03c0 * radius^2) is " + calculateArea());
    }
}

class Triangle implements Shape {
    double base;
    double height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void display() {
        System.out.println("The area of this rectangle (0.5 * base * height) is " + calculateArea());
    }
}

public class AssignmentThree {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3.2, 2.5);
        Shape square = new Rectangle(1.5);
        Shape circle = new Circle(3.0);
        Shape triangle = new Triangle(2.3, 1.5);

        rectangle.display();
        square.display();
        circle.display();
        triangle.display();
    }
}
