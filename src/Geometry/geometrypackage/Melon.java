package Geometry.geometrypackage;

public class Melon implements Shape {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Melon() {
        weight = 0;
    }

    public double Melon(double weight) {
        this.weight = weight;
        return weight;
    }

    @Override
    public double getArea() {
        System.out.println("Прости, мы пока не в силах посчитать площадь Дыни, но вот тебе её вес: ");
        return 0;
    }


}
