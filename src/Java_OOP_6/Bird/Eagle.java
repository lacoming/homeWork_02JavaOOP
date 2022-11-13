package Java_OOP_6.Bird;

public class Eagle extends  Bird{

    private final String name = "Орёл";

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
        System.out.println("Могу летать, цепляться когтями за ветви и ходить.");
    }

}
