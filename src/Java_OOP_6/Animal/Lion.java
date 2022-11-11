package Java_OOP_6.Animal;

public class Lion extends Animal {
    @Override
    public void breath() {
        System.out.println("Дышит легкими, может рычать.");
    }

    @Override
    public void move() {
        System.out.println("Передвигается на четырех лапах, может быстро бегать и прыгать.");
    }

    @Override
    public void name() {
        System.out.println("Лев");
    }
}
