package Java_OOP_2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String firstName;
        String lastName;
        String middleName;
        String profession;
        int age;
        int passportSeries;
        int passportNumber;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        firstName = in.nextLine();

        System.out.println("Введите фамилию: ");
        lastName = in.nextLine();

        System.out.println("Введите отчество: ");
        middleName = in.nextLine();

        System.out.println(firstName + ", введите кем вы работаете: ");
        profession = in.nextLine();

        System.out.println(firstName + ", сколько вам лет? ");
        age = in.nextInt();

        if (age < 18){
            System.out.println("Ой-ёй! Всего " + age + ", а уже работаешь!");
        }

        System.out.println("Введите серию паспорта: ");
        passportSeries = in.nextInt();

        System.out.println("Введите номер паспорта: ");
        passportNumber = in.nextInt();

        for (int i = 3; i > 0; i--) {
            System.out.println("На вас оформится кредит через " + i + "...");
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println("Шутка.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Ха-ха.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Вот всё, что я о тебе знаю: ");
        System.out.println();
        System.out.println(lastName + " " + firstName + " " + middleName);
        System.out.println("Профессия: " + profession);
        System.out.println("Возраст: " + age);
        System.out.println("Серия/номер паспорта: " + passportSeries + " " + passportNumber);









    }
}