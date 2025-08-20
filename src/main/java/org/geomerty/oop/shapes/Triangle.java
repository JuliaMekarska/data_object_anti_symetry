package org.geomerty.oop.shapes;

public class Triangle {
    public Point vertex;
    public double aSide;
    public double bSide;
    public double cSide;
    public double height;
    public double area;
    public double perimeter;

    public Triangle(Point vertex, double height, double cSide, double bSide, double aSide) {
        this.vertex = vertex;
        this.height = height;
        this.cSide = cSide;
        this.bSide = bSide;
        this.aSide = aSide;
        this.area = (height * aSide) / 2;
        this.perimeter = aSide + bSide + cSide;
    }
}
