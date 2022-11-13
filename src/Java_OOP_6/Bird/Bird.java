package Java_OOP_6.Bird;

import Java_OOP_6.Personal_Card;
import Java_OOP_6.Skills;

public class Bird extends Personal_Card implements Skills {

    private String name = "ПТИЦЫ";

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
        System.out.println("Воздух в организм птицы поступает через две ноздри, расположенные над клювом. " +
                "После этого через глотку он поступает в длинную трахею. Переходя в грудную полость, трахея делится на два бронха. " +
                "В месте разветвления трахеи у птиц находится расширение – так называемая нижняя гортань. Здесь расположены голосовые связки. " +
                "Легкие у птиц располагаются в полости тела не так, как у человека. Они прочно прикреплены к ребрам и позвоночному столбу, " +
                "малоэластичны и не могут растягиваться, наполняясь кислородом.");
    }

    @Override
    public void move() {
        System.out.println("Могут летать, ходить, прыгать, бегать.");
    }


}
