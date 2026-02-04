class Shape {
    void area() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    void area() {
        int r = 5;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 4, b = 6;
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Circle();      // parent reference
        Shape s2 = new Rectangle();   // parent reference

        s1.area();   // calls Circle area()
        s2.area();   // calls Rectangle area()
    }
}
