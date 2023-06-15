package Geometry.geometrypackage;

public class Rectangle implements Shape {
    private double length;
    private double high;

    public Rectangle() {
        length = 0;
    }

    @Override
    public double getArea() {
        return length * high;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public Rectangle(double _length, double _high) {
        length = _length;
        high = _high;
    }


}