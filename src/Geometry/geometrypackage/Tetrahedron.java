package Geometry.geometrypackage;


public class Tetrahedron implements Shape {
    private double length;

    public Tetrahedron() {
        length = 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double _length) {
        length = _length;
    }

    public Tetrahedron(double _length) {
        length = _length;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length;
    }

}
