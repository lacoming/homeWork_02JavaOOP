package Java_OOP_6.Bird;

public class Eagle extends  Bird{

    public Eagle (){
        name = "Орёл";
    }

    @Override
    public void move (){
        System.out.println("Могу летать, цепляться когтями за ветви и ходить.");
    }

}
