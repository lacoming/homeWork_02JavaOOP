package Java_OOP_6.Bird;

public class Penguin extends Bird {

    private final String name = "ПИНГВИН";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(this.name);
    }

    @Override
    public void move (){
        System.out.println("Ходить на задних лапах, плавать под водой.");
    }
}
