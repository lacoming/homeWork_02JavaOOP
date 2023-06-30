package Java_OOP_4_online_lesson;

import java.util.ArrayList;

public class Main {
    static public ArrayList<Drive> getEngines() {
        ArrayList<Drive> engines = new ArrayList<Drive>();
        engines.add(new Car());
        engines.add(new Minivan());
        engines.add(new Minivan());
        engines.add(new Minivan());
        engines.add(new SUV());
        engines.add(new SUV());
        engines.add(new Frame_Jeep());
        engines.add(new Frame_Jeep());
        engines.add(new Track());
        engines.add(new Track());
        engines.add(new Pajero());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Train());
        engines.add(new Plain());
        engines.add(new Land_Cruiser());
        engines.add(new Wrangler_Jeep());
        engines.add(new Bike());
        engines.add(new Bike());
        return engines;
    }

    public static void main(String[] args) {
        try {
            for (Drive engine : getEngines()) {
                engine.driveOn();
            }
            for (Drive engine : getEngines()) {
                engine.driveOf();
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}