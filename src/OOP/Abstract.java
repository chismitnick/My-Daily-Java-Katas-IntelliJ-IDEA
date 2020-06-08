package OOP;
/* A simple Java Program to demonstrate the operation of
method overriding and abstract methods and classes
 */

/**
 * Written By csamiselo@github.com 2019
 */


//Declaration of an abstract class
abstract class Polygon {
    double side1;
    double side2;

    Polygon(double a, double b) {
        side1 = a;
        side2 = b;
    }

    abstract double area();
}

class Rectangle extends Polygon {

    //Constructor to initialize variables
    Rectangle(double a, double b) {
        super(a, b);
    }

    //Implementation of abstract method from super class
    // all subclasses of polygon must override this method
    double area() {

        return side1 * side2;
    }
}

class Triangle extends Polygon {

    //Constructor to initialize variables
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return side1 * side2 / 2;
    }
}


public class Abstract {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(15, 23);

        // This is just a reference variable not an object
        //Java does not allow the instantiation of objects using the new key word
        Polygon polygon;

        polygon = r;
        System.out.println("The area of the OOP.Rectangle is:" + " " + r.area() + " square centimetres");

        polygon = t;
        System.out.println("The area of the OOP.Rectangle is:" + " " + t.area() + " square centimetres");

    }

}
