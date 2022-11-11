package Java_OOP_6.Fish;

import Java_OOP_6.Personal_Card;
import Java_OOP_6.Skills;

public class Fish implements Skills, Personal_Card {
    @Override
    public void breath() {
        System.out.println("Жабрами");
    }

    @Override
    public void move() {
        System.out.println("Может плыть, выпрыгивать из воды.");
    }

    @Override
    public void name() {
        System.out.println("Рыбы");
    }
}
