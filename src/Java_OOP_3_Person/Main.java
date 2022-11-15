package Java_OOP_3_Person;


public class Main {
    public static void main(String[] args){

        Menu menu = new Menu();
        Personal_Card person = new Personal_Card();

        menu.showMenu();
        menu.action(person);

    }
}
