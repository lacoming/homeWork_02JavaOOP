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
        System.out.println("Дышу легкими, а ещё могу рычать! АГРРР!!");
    }

    @Override
    public void move() {
        System.out.println("Стою твёрдо на четырёх лапах, так что могу быстро бегать и прыгать!");
    }

}
