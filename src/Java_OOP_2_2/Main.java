package Java_OOP_2_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите любое слово или фразу: ");
        String text1 = input.nextLine();

        while(text1.isEmpty()){
            System.out.println("Упс! Ты ничего не ввёл, давай попробуем ещё раз: ");
            text1 = input.nextLine();
        }

        System.out.println("Введите ещё одно слово или фразу: ");
        String text2 = input.nextLine();

        while(text2.isEmpty()){
            System.out.println("Упс! Ты ничего не ввёл, давай попробуем ещё раз: ");
            text2 = input.nextLine();
        }

        String sumOfTexts = text1 + text2;
        System.out.println("Сумма двух текстов: " + sumOfTexts);

        System.out.println("Длина всех текстов: " + sumOfTexts.length());

        System.out.println("Это второй символ всех текстов: " + sumOfTexts.charAt(1));

        System.out.println("Давай сравним два текста: ");

        if (text1.equals(text2)){
            System.out.println("Ой, ёй! Они равны!");
        }
        else System.out.println("Как и ожидалось, они разные");

        System.out.println("А может во всём виноват регистр? Давай ещё раз сравним тексты, не учитывая регистр: ");

        if (text1.equalsIgnoreCase(text2)){
            System.out.println("Обе строки равны!");
        }
        else System.out.println("А, нет. Они всё ещё разные");

        System.out.println("Как думаешь, с какого слова начинается второй текст: ");
        String temporary = input.nextLine();

        if (text2.startsWith(temporary)){
            System.out.println("Точно! Второй текст начинается с " + temporary);
        }
        else System.out.println("Не-а, там было по-другому");

        System.out.println("Продолжим викторину! Напиши 7 символ первого текста: ");
        temporary = input.nextLine();

        if (text1.length() < 7){
            System.out.println("Ты совершенно прав, в нём нет столько символов!");
        }
        else {
            if (text1.startsWith(temporary, 6)) {
                System.out.println("Именно так! Ты просто джиниус!");
            } else System.out.println("Упс! Не угадал");
        }

        System.out.println("Даю тебе ещё один шанс! Каким словом заканчивается второй текст: ");
        temporary = input.nextLine();

        if (text2.endsWith(temporary)){
            System.out.println("Вот, так ёжики-сапожики! Ты всё знаешь!");
        }
        else System.out.println("Не-а. Но не расстраивайся, это действительно сложно!");

        System.out.println("Давай к первому тексту, добавим ещё немного букв, напиши, что добавить: ");
        temporary = input.nextLine();

        System.out.println("Вот, что получилось: ");
        System.out.println(text1.concat(temporary));

        System.out.println("А теперь давай заменим какую-нибудь букву во всём втором тексте. Введи букву, которую будем менять: ");
        temporary = input.nextLine();

        System.out.println("Теперь введи новую букву: ");

        String temporary2 = input.nextLine();

        System.out.println("Вот, что получилось: ");
        System.out.println(text2.replace(temporary, temporary2));

        System.out.println("Давай выведем сумму строк в нижнем регистре: ");
        System.out.println(sumOfTexts.toLowerCase());

        System.out.println("И напоследок - введи название улицы где ты живешь: ");

        String street = input.nextLine();

        System.out.println("Теперь введи номер дома: ");

        int numberOfHouse = input.nextInt();

        System.out.println("и номер квартиры: ");

        int numberOfAppartement = input.nextInt();

        temporary = String.format("Доставка печенек вызвана по адресу %s %d, кв %d", street, numberOfHouse, numberOfAppartement);

        System.out.println(temporary);

    }
}