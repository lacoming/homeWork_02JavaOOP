package Java_OOP_6.Fish;

public class Pike extends Fish {
    private final String name = "ЩУКА";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(this.name);
    }
}
