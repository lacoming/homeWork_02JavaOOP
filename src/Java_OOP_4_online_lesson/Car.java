package Java_OOP_4_online_lesson;

public class Car implements Drive {
    @Override
    public void driveOn() {
        changeGear();
        changeGear();
        changeGear();
    }

    @Override
    public void driveOf() throws Exception {
        changeGear();
    }

    protected void changeGear() {
        System.out.println("Изменили скоростную передачу");
    }
}
