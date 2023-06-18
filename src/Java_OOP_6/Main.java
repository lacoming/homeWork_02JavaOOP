package Java_OOP_6;

import Java_OOP_6.Animal.Animal;
import Java_OOP_6.Animal.Bull;
import Java_OOP_6.Animal.Lion;
import Java_OOP_6.Bird.Bird;
import Java_OOP_6.Bird.Eagle;
import Java_OOP_6.Bird.Penguin;
import Java_OOP_6.Fish.Fish;
import Java_OOP_6.Fish.Pike;
import Java_OOP_6.Fish.Shark;

import java.util.Scanner;

public class Main {

    public static Skills[] generateSkills() {
        Skills[] skills = new Skills[9];
        skills[0] = new Lion();
        skills[1] = new Bull();
        skills[2] = new Bird();
        skills[3] = new Penguin();
        skills[4] = new Eagle();
        skills[5] = new Shark();
        skills[6] = new Pike();
        skills[7] = new Fish();
        skills[8] = new Animal();
        return skills;
    }

    public static void main(String[] args) {
        Skills[] skills = generateSkills();

        for (int i = 0; i < skills.length; i++) {

            System.out.println((i + 1) + " " + skills[i].getName());
        }

        System.out.println();
        System.out.println("Напишите номер, понравившегося существа: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        number = number - 1;

        for (int i = 0; i < skills.length; i++) {
            if (number == i) {
                System.out.println(skills[i].getName());
                skills[i].breath();
                skills[i].move();
            }
        }
    }
}
