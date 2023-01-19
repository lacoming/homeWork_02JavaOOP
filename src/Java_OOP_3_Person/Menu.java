package Java_OOP_3_Person;
import java.util.Scanner;

public class Menu implements Action {

    private final String ENTER_NAME = "1. Ввести имя ";
    private final String ENTER_LASTNAME = "2. Ввести фамилию ";
    private final String ENTER_BIRTHDAY = "3. Ввести год рождения ";
    private final String INFORMATION = "4. Вывести информацию ";
    private final String EXIT = "0. Выход ";

    public Menu(){
        showMenu();
    }


    public String getENTER_NAME() {
        return ENTER_NAME;
    }

    public String getENTER_LASTNAME() {
        return ENTER_LASTNAME;
    }

    public String getENTER_BIRTHDAY() {
        return ENTER_BIRTHDAY;
    }

    public String getINFORMATION() {
        return INFORMATION;
    }

    public String getEXIT() {
        return EXIT;
    }

    public void showMenu() {
        System.out.println();
        System.out.println(ENTER_NAME);
        System.out.println(ENTER_LASTNAME);
        System.out.println(ENTER_BIRTHDAY);
        System.out.println(INFORMATION);
        System.out.println(EXIT);
        System.out.println();
        System.out.print("Введите номер меню: ");
    }

    @Override
    public Personal_Card action(Personal_Card person) {

        int number;
        int year = 0;

        Scanner input = new Scanner(System.in);

        Menu menu = new Menu();


        number = input.nextInt();


        while (number != 0) {

            switch (number) {

                case 1:
                    System.out.print("Введите ваше имя: ");

                    String name = input.next();

                    person.setName(name);

                    System.out.println("Ваше имя добавлено!");
                    break;

                case 2:
                    System.out.print("Введите фамилию: ");

                    person.setLastName(input.next());

                    System.out.println("Ваша фамилия добавлена!");
                    break;

                case 3:
                    System.out.print("Введите год рождения: ");

                    while (year < 1830) {

                        year = input.nextInt();

                        if (year > 1830) {
                            person.setBirthday(year);
                        }
                        else System.out.println("Ох, ты ёшки-трёшки! Столько не живут, давай ещё раз попробуем");

                    }

                    System.out.println("Вы ввели год рождения!");
                    break;

                case 4:
                    person.information();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Такого номера в меню нет, попробуйте ещё раз.");
                    break;

            }

            menu.showMenu();

            number = input.nextInt();
        }

    return person;

    }
}
