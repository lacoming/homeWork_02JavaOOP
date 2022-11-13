package Java_OOP_6.Animal;

public class Lion extends Animal {

    private final String name = "ЛЕВ";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(this.name);
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
