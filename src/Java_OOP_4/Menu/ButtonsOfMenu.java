package Java_OOP_4.Menu;

public enum ButtonsOfMenu {
    CATALOG("1. Вывести список всех книг"),
    TAKE("2. Взять книгу из библиотеки"),
    ADD("3. Положить книгу в библиотеку"),
    FIND("4. Найти книгу"),
    EXIT("0. Выход");


    final String book;
    ButtonsOfMenu(String book) {
        this.book = book;
    }
}
