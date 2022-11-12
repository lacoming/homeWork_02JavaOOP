package Java_OOP_6.Bird;

public class Penguin extends Bird {

    public Penguin (){
        name = "Пингвин";
    }

    @Override
    public void move (){
        System.out.println("Ходить на задних лапах, плавать под водой.");
    }
}
