package Java_OOP_6.Fish;

import Java_OOP_6.Personal_Card;
import Java_OOP_6.Skills;

public class Fish extends Personal_Card implements Skills {

    private final String name = "РЫБЫ";

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
        System.out.println("Жабрами");
    }

    @Override
    public void move() {
        System.out.println("Может плыть, выпрыгивать из воды.");
    }


}
