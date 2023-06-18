package Geometry.geometrypackage;

public class Square implements Shape {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Square() {
        length = 0;
    }

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }


}
