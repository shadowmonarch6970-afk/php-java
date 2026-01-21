import java.util.Scanner;

// Base class
abstract class Shape {
    abstract void area(); // Abstract method to be overridden
}

// 2D shape base class
abstract class TwoDim extends Shape {
    // Common 2D properties can be added here
}

// 3D shape base class
abstract class ThreeDim extends Shape {
    // Common 3D properties can be added here
}

// Square class
class Square extends TwoDim {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    void area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

// Triangle class
class Triangle extends TwoDim {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Sphere class
class Sphere extends ThreeDim {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double area = 4 * Math.PI * radius * radius;
        System.out.println("Surface Area of Sphere: " + area);
    }
}

// Cube class
class Cube extends ThreeDim {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    void area() {
        double area = 6 * side * side;
        System.out.println("Surface Area of Cube: " + area);
    }
}

// Main class to test
public class ShapeHierarchyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape;

        // Input for Square
        System.out.print("Enter side of square: ");
        double squareSide = scanner.nextDouble();
        shape = new Square(squareSide);
        shape.area();

        // Input for Triangle
        System.out.print("\nEnter base of triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double triangleHeight = scanner.nextDouble();
        shape = new Triangle(triangleBase, triangleHeight);
        shape.area();

        // Input for Sphere
        System.out.print("\nEnter radius of sphere: ");
        double sphereRadius = scanner.nextDouble();
        shape = new Sphere(sphereRadius);
        shape.area();

        // Input for Cube
        System.out.print("\nEnter side of cube: ");
        double cubeSide = scanner.nextDouble();
        shape = new Cube(cubeSide);
        shape.area();

        scanner.close();
    }
}

