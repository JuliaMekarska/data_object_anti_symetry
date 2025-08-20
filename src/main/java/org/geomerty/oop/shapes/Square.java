package org.geomerty.oop.shapes;

import org.geomerty.oop.shapes.Point;

public class Square {
    public Point topLeft;
    public double side;
    public double squareArea;
    public double perimeter;

    public Square(Point topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
        this.squareArea = side * side;
        this.perimeter = 4 * side;
    }

}
