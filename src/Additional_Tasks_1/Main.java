package Additional_Tasks_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите любое число: ");

        int number = input.nextInt();

        if(number < 10)
            System.out.println("Число меньше 10");
        else {
            if (number > 10)
                System.out.println("Число больше 10");
            else
                System.out.println("Число равно 10");
        }

        System.out.println("Введите ещё одно число: ");

        int number2 = input.nextInt();

        if(number < number2)
            System.out.println("Первое число меньше, чем второе");
        else {
            if (number > number2)
                System.out.println("Первое число больше, чем второе");
            else
                System.out.println("Числа равны");
        }
    }
}