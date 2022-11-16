package Java_OOP_6.Animal;

import Java_OOP_6.Personal_Card;
import Java_OOP_6.Skills;

// TODO переписать на абстрактный

public class Animal extends Personal_Card implements Skills{

    private final String name = "ЗВЕРЬ";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(this.name);
    }

    @Override
    public void breath() {

        System.out.println("");
        System.out.println("Я дышу легкими.");
    }

    public void move() {
        System.out.println("Могу ходить, бегать, прыгать, плавать и даже летать.");
    }
}
