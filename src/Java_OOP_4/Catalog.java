package Java_OOP_4;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<Book> catalog = new ArrayList<Book>();

    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public void addBook(Book book) {
        if (!isFull()) {
            catalog.add(book);
        } else {
            System.out.println("The Library is full, please delete some book, if you want to add a new book.");
        }
    }

    public void deleteBook(Book book) {
        catalog.remove(book);
    }

    public boolean isFull() {
        return catalog.size() > 100;
    }

    public Book findBook(String name) {
        for (Book book : catalog) {
            if (book.getName().equals(name)) {
                System.out.println("Такая книга имеется");
                return book;
            }
        }
        return null; // Это работает?
    }

    public Book takeBook(String name) {

        if (findBook(name) != null) {
            Book book = findBook(name);
            deleteBook(findBook(name));
            return book;
        } else {
            System.out.println("This book not founded. Please change your offer");
            return null;
        }
    }

    public void showAllNamesOfBooks(){
        for(Book book : catalog){
            System.out.println(book.getName());
        }
    }
}
