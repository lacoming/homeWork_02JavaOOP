package Java_OOP_6.Bird;

import Java_OOP_6.Personal_Card;
import Java_OOP_6.Skills;

public class Bird extends Personal_Card implements Skills {

    private String name = "ПТИЦА";

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
        System.out.println("Дышу ноздрями, далее помогают дыхательные трахеи и воздух попадает в бронхи.");
    }

    @Override
    public void move() {
        System.out.println("Могу летать, ходить, прыгать и даже бегать.");
    }


}
