package Java_OOP_04_online_lesson;


public class Plain implements Drive{
    @Override
    public void driveOn() {
        // 10 000 lines of code
    }

    @Override
    public void driveOf() throws Exception/*ExecutionControl.NotImplementedException*/ {
        //throw new ExecutionControl.NotImplementedException("Can't implement driveOf for plain");
        throw new Exception();
    }
}
