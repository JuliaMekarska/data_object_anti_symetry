package org.geomerty.oop.shapes;

import org.geomerty.oop.shapes.Point;

public class Rectangle {
    public Point topLeft;
    public double height;
    public double width;
    public double rectangleArea;

    public Rectangle(Point topLeft, double height, double width) {
        this.topLeft = topLeft;
        this.height = height;
        this.width = width;
        this.rectangleArea = (height * width)/2;;
    }

}
