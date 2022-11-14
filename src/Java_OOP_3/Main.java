package Java_OOP_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String str = new String();
        Scanner scanner = new Scanner(System.in);
        while (!str.equalsIgnoreCase("Exit")) {
            System.out.print("Please, enter 'Exit': ");
            str = scanner.nextLine();
        }

        int x;

        do {
            System.out.print("Please enter a positive number: ");
            x = scanner.nextInt();
        } while (x < 0);


        int sum = 0;

        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
        System.out.println();
        System.out.println ("Please enter your score: ");

        int score = new Scanner(System.in).nextInt();

        while (score < 0 || score > 100){
            System.out.println("Ups! Your score out of bounce, please enter score from 0 to 100: ");
            score = new Scanner(System.in).nextInt();
        }

        if (score >= 70) {
            System.out.println("Congrats! You’ve passed the test!");
        } else {
            System.out.println("Sorry, you’ve failed the test.");
        }


        Remote remote = new Remote();
        remote.tvProgram();

    }
}
