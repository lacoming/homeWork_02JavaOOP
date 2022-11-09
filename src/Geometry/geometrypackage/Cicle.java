package Geometry.geometrypackage;

public class Cicle implements Shape{

    public Cicle(){
        radius = 0;
    }

    public Cicle(double _radius){
        radius = _radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        //return PI * radius * radius;
        return  PI * Math.pow(radius, 2);
    }

    static final double PI = 3.14;

    private double radius;
}
