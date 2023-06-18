package Geometry.geometrypackage;


public class Tetrahedron implements Shape {
    private double length;

    public Tetrahedron() {
        length = 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Tetrahedron(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length;
    }

}
