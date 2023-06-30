package Java_OOP_4_online_lesson;

public class Bike implements Drive {
    @Override
    public void driveOn() {
        System.out.println("Завели Мотоцикл");
    }

    @Override
    public void driveOf() throws Exception {
        System.out.println("Заглушили двигатель мотоцикла");
    }
}
