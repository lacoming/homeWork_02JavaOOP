package Java_OOP_6.Animal;

import Java_OOP_6.Personal_Card;
import Java_OOP_6.Skills;

public class Animal extends Personal_Card implements Skills{


    public Animal(){
        name = "Звери";
    }

    public Animal (String _name){
        name = _name;
    }

    @Override
    public void breath() {
        System.out.println("Легкими дышат.");
    }

    @Override
    public void move() {
        System.out.println("Ходят, бегают, прыгают, лазают, плавают, летают.");
    }

}
