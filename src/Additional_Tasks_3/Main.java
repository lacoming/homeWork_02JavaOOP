package Additional_Tasks_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] numbers = new int[4];
        int temp;

        for (int i = 0; i < 4; i++){
            System.out.println("Введите число: ");
            temp = input.nextInt();
            numbers [i] = temp;
        }

        temp = 0;

        for (int i = 0; i < 4; i++){
            if (numbers [i] < 0){
                temp++;
            }
        }

        System.out.println("Количество отрицательных чисел " + temp);
        System.out.println("Количество положительных чисел " + (4 - temp));
    }
}