package Additional_Tasks_Cycle_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Таблица умножения на 4:");

        for (int i = 1; i <= 10; i++){
            System.out.println(4 * i);
        }

        System.out.println("Введите любое число, и я покажу все четные числа до него включительно: ");

        int temp = input.nextInt();

        for (int i = 0; i <= temp; i++){
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("Введите номер, а я выдам число из последовательности Фибоначчи под этим номером: ");

        temp = input.nextInt();

        int n0 = 1;
        int n1 = 1;
        int n2;

        if(temp <= 2)
            System.out.println(n0);

        for (int i = 3; i <= temp; i++){
            n2 = n0 + n1;
            if(i == temp)
                System.out.println(n2);
            n0 = n1;
            n1 = n2;
        }

        System.out.println("Теперь введите число, и я поситаю факториал этого числа: ");

        temp = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= temp; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);

    }
}