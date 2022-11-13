package Java_OOP_6.Animal;

public class Bull extends Animal {

    private final String name = "БЫК";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(this.name);
    }

    @Override
    public void breath (){
        System.out.println("Дышит легкими, может пыжить носом.");
    }

    @Override
    public void move (){
        System.out.println("Парнокопытное, может скакать и бодаться.");
    }


}
