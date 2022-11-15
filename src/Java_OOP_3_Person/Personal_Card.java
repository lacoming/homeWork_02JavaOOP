package Java_OOP_3_Person;

public class Personal_Card {

    private String name;
    private String lastName;
    private int birthday;


    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getBirthday() {
        return birthday;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void information (){
        System.out.println("Вот, что мне о вас известно: ");
        System.out.println();
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Год рождения: " + birthday);
    }

}
