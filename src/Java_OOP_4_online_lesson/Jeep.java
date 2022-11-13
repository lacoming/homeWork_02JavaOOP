package Java_OOP_4_online_lesson;

public abstract class Jeep extends Minivan{
    @Override
    public void driveOn() {
        super.driveOn();
        // + 2 special lines due to AWD
    }

    @Override
    protected void changeGear() {
        super.changeGear();
        // ADD 2 lines of code
    }
}
