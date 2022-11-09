package Java_OOP_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String lastName = input.nextLine();

        System.out.println("Введите имя: ");
        String firstName = input.nextLine();

        System.out.println("Введите кем вы работаете: ");
        String profession = input.nextLine();

        System.out.println(lastName + " " + firstName);
        System.out.println("Профессия: " + profession);
    }
}