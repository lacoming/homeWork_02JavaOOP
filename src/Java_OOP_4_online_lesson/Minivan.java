package Java_OOP_4_online_lesson;

public class Minivan extends Car {
    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        changeGear();
    }

    @Override
    public void driveOf() throws Exception {
        super.driveOf();
        changeGear();
    }
}
