package Java_OOP_6;

public class Name implements Personal_Card {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }
}
