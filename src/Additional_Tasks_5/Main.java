package Additional_Tasks_5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] menu = {"1. Оливье", "2. Борщ", "3. Котлетка с пюрешкой"};
        int [] price = {50, 120, 150};

        System.out.println("Наше меню: ");

        for (int i = 0; i < menu.length; i++){
            System.out.println(menu[i] + " - " + price[i] + " рублей");
        }

        System.out.println();
        System.out.println("Введите номер блюда: ");

        int numOfDish = input.nextInt();

        System.out.println("Введите необходиму сумму: ");

        int money = input.nextInt();

        if (price[numOfDish - 1] > money){
            System.out.println("Упси! Деньжат-то не хватает!");
        }
        else {
            if (price[numOfDish - 1] < money){
                System.out.println("Спасибо за покупку!");
                System.out.println("Ваша сдача: " + (money - price[numOfDish - 1]));
            }
            else
                System.out.println("Спасибо за покупку!");
        }

    }
}
