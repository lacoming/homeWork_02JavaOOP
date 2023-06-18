package Java_OOP_6.Fish;

import Java_OOP_6.Personal_Card;
import Java_OOP_6.Skills;

public class Fish extends Personal_Card implements Skills {

    private final String name = "РЫБА";

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
        System.out.println("Дышу очень просто - Жабрами");
    }

    @Override
    public void move() {
        System.out.println("Могу плыть, могу не плыть. О, еще иногда люблю выпрыгивать из воды.");
    }
}
