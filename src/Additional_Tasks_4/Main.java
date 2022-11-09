package Additional_Tasks_4;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] numbers = new int[3];
        int temp;

        for (int i = 0; i < 3; i++){
            System.out.println("Введите число: ");
            temp = input.nextInt();
            numbers [i] = temp;
        }

        Arrays.sort(numbers);

        System.out.println("Наибольшее число " + numbers[2]);
        System.out.println("Наименьшее число " + numbers[0]);

        temp = numbers[0] + numbers[2];

        System.out.println("Сумма наибольшего и наименьшего чисел " + temp);

        System.out.println("Введите число ");

        temp = input.nextInt();

        if(temp % 2 == 0){
            System.out.println("Ваше число чётное!");
        }
        else
            System.out.println("Ваше число нечётное!");
    }
}