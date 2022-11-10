package Java_OOP_6.Animal;

import Java_OOP_6.Name;
import Java_OOP_6.Personal_Card;
import Java_OOP_6.Skills;

public class Animal implements Skills, Personal_Card {

    @Override
    public void breath() {
        System.out.println("Легкими дышат.");
    }

    @Override
    public void move() {
        System.out.println("Ходят, бегают, прыгают, лазают, плавают, летают.");
    }

    @Override
    public void getName() {
    }
}
