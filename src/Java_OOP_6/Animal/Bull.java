package Java_OOP_6.Animal;

public class Bull extends Animal {



    public Bull (){
        name = "Бык";
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
