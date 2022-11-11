package Java_OOP_6.Animal;

public class Bull extends Animal {
    @Override
    public void breath (){
        System.out.println("Дышит легкими, может пыжить носом.");
    }

    @Override
    public void move (){
        System.out.println("Парнокопытное, может скакать и бодаться.");
    }

    @Override
    public void name() {
        System.out.println("Бык");
    }
}
