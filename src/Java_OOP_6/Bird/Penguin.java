package Java_OOP_6.Bird;

public class Penguin extends Bird {
    @Override
    public void move (){
        System.out.println("Ходить на задних лапах, плавать под водой.");
    }

    @Override
    public void name() {
        System.out.println("Пингвин");
    }
}
