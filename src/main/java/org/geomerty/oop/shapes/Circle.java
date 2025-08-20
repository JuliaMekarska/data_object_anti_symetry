package org.geomerty.oop.shapes;

import org.geomerty.oop.shapes.Point;

import static java.lang.Math.PI;

public class Circle {
    public Point center;
    public double radius;
    public double circleArea;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        this.circleArea = PI * radius * radius;
    }

}
