package Additional_Tasks.Additional_Tasks_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int side1;
        int side2;
        int side3;

        System.out.println("Введите длину первой стороны треугольника: ");

        side1 = input.nextInt();

        System.out.println("Введите длину второй стороны треугольника: ");

        side2 = input.nextInt();

        System.out.println("Введите длину третьей стороны треугольника: ");

        side3 = input.nextInt();

        if (side1 == side2 && side1 == side3)
            System.out.println("Это равносторонний треугольник");
        else {
            if (side1 == side2 || side1 == side3 || side2 == side3)
                System.out.println("Это равнобедренный треугольник");
            else
                System.out.println("Это разносторонний треугольник");
        }
    }
}
