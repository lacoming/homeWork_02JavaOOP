package Java_OOP_6.Animal;

public class Lion extends Animal {

    public Lion (){
        name = "Лев";
    }

    @Override
    public void breath() {
        System.out.println("Дышит легкими, может рычать.");
    }

    @Override
    public void move() {
        System.out.println("Передвигается на четырех лапах, может быстро бегать и прыгать.");
    }


}
