package app;

import shapes.*;

public class ShapeDemo {

    public static void main(String[] args) {

        Shape s;

        // Dynamic polymorphism
        s = new Cube(3);
        System.out.println("Cube Area = " + s.area());
        System.out.println("Cube Volume = " + s.volume());

        s = new Sphere(2);
        System.out.println("Sphere Area = " + s.area());
        System.out.println("Sphere Volume = " + s.volume());

        // Static polymorphism
        System.out.println("Square Area (static double) = " + Square.area(5.0));
        System.out.println("Square Area (static int) = " + Square.area(6));
        System.out.println("Circle Area (static) = " + Circle.area(4));
    }

}
