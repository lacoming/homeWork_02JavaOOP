package Java_OOP_6.Fish;

public class Shark extends Fish {
    private final String name = "АКУЛА";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(this.name);
    }

    @Override
    public void move() {
        System.out.println("Плаваю под водой, и, как любой хищник, ем других существ.");
    }

}
