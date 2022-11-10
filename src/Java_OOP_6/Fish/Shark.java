package Java_OOP_6.Fish;

public class Shark extends Fish{
    @Override
    public void move () {
        System.out.println("Плаваю под водой, и, как любой хищник, ем других существ.");
    }

    @Override
    public void setName(String name) {
        super.setName("Акула");
    }
}
