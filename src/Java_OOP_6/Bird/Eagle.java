package Java_OOP_6.Bird;

public class Eagle extends  Bird{
    @Override
    public void move (){
        System.out.println("Могу летать, цепляться когтями за ветви и ходить.");
    }

    @Override
    public void name() {
        System.out.println("Орёл");
    }
}
