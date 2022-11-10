package Java_OOP_6.Fish;

import Java_OOP_6.Name;
import Java_OOP_6.Skills;

public class Fish extends Name implements Skills {
    @Override
    public void breath() {
        System.out.println("Жабрами");
    }

    @Override
    public void move() {
        System.out.println("Может плыть, выпрыгивать из воды.");
    }

    @Override
    public void setName(String name) {
        super.setName("Рыбы");
    }
}
