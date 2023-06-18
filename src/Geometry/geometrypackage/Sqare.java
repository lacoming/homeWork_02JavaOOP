package Geometry.geometrypackage;

public class Sqare implements Shape {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Sqare() {
        length = 0;
    }

    public Sqare(double _length) {
        length = _length;
    }

    @Override
    public double getArea() {
        return length * length;
    }


}
