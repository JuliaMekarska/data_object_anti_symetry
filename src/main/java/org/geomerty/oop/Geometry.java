package org.geomerty.oop;


import org.geomerty.oop.shapes.*;

public class Geometry {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(8.7,4.0),6.3);
        Rectangle rectangle = new Rectangle(new Point(10., 5.0), 4.0, 5.0);
        Square square = new Square(new Point(2.5, 4.5), 3.0);
        Triangle triangle = new Triangle(new Point(0.0, 0.0), 2.4, 3.0, 4.0, 5.0);

        System.out.println("Area of circle is " + circle.circleArea);
        System.out.println("Area of rectangle is " + rectangle.rectangleArea);
        System.out.println("Area of square is " + square.squareArea);
        System.out.println("Area of triangle is " + triangle.area);

        System.out.println("Perimeter of circle is " + circle.perimeter);
        System.out.println("Perimeter of rectangle is " + rectangle.perimeter);
        System.out.println("Perimeter of square is " + square.perimeter);
        System.out.println("Perimeter of triangle is " + triangle.perimeter);
    }
}