package Java_OOP_4;

import Java_OOP_4.Menu.Menu;

public class Main {

    public static void main (String[] args){
        Menu menu = new Menu();

        while (true){

            menu.showMenu();
            int number = menu.enterNumberOfMenu();

            if(number == 0){
                System.out.println("До скорых встреч!");
                break;
            }
            menu.actionOfMenu(number);

        }
    }
}
