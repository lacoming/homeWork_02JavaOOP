package Geometry.geometrypackage;

public class Circle implements Shape {
    static final double PI = 3.14;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }


}
