package Java_OOP_4.Menu;

import Java_OOP_4.Book;
import Java_OOP_4.Catalog;

import java.util.Scanner;

public class Menu extends Catalog {
    public void showMenu() {

        for (ButtonsOfMenu buttonsOfMenu : ButtonsOfMenu.values()) {
            System.out.println(buttonsOfMenu.book);
        }
        System.out.println();
        System.out.println("Введите номер: ");

    }

    public int enterNumberOfMenu() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void actionOfMenu(int number){
        switch (number) {
            case 0 -> System.out.println("До новых встреч!");
            case 1 -> {
                System.out.println("Список книг в библиотеке: ");
                showAllNamesOfBooks();
                System.out.println();
            }
            case 2 -> {
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                takeBook(name);
                System.out.println();
            }
            case 3 -> {
                if(!isFull()) {
                    System.out.println("Введите название книги: ");
                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.nextLine();
                    Book book = new Book();
                    book.setName(name);
                    addBook(book);
                }
                System.out.println();
            }
            case 4 -> {
                System.out.println("Введите название книги: ");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                findBook(name);
                System.out.println();
            }
            default -> {
                System.out.println("Такого номера нет в списке, попробуй ещё раз:");
                System.out.println();
            }
        }
    }
}
