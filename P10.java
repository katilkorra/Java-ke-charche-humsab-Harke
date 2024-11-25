import java.util.Scanner;

// Define the Shape interface
interface Shape {
    double area();
    double perimeter();
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private int value1; // Length
    private int value2; // Width

    public Rectangle(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }
    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    @Override
    public double area() {
        return value1 * value2;
    }

    @Override
    public double perimeter() {
        return 2 * (value1 + value2);
    }
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    private int value1; // Base
    private int value2; // Height
    private int value3; // Side length

    public Triangle(int value1, int value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

    

    @Override
    public double area() {
        return 0.5 * value1 * value2; // Assuming value1 is base and value2 is height
    }

    @Override
    public double perimeter() {
        return value1 + value2 + value3;
    }
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2); // Area = πr²
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // Circumference = 2πr
    }
}

// Main class to run the program
public class P10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number (for Rectangle and Triangle):");
        int a = input.nextInt();
        System.out.println("Enter the second number (for Rectangle and Triangle):");
        int b = input.nextInt();
        System.out.println("Enter the third number (for Triangle):");
        int c = input.nextInt();

        Rectangle newRect = new Rectangle(a, b);
        Triangle newTri = new Triangle(a, b, c);
        Circle newCir = new Circle(a); // Use only the first value as radius

        System.out.printf("Area of Rectangle: %f%n", newRect.area());
        System.out.printf("Perimeter of Rectangle: %f%n", newRect.perimeter());
        System.out.printf("Area of Triangle: %f%n", newTri.area());
        System.out.printf("Perimeter of Triangle: %f%n", newTri.perimeter());
        System.out.printf("Area of Circle: %f%n", newCir.area());
        System.out.printf("Perimeter of Circle: %f%n", newCir.perimeter());

        
    }
}
