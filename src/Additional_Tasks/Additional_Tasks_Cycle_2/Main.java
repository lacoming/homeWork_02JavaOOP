package Additional_Tasks.Additional_Tasks_Cycle_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите любое слово или предложение, а я разобъю этот текст посимволльно: ");

        String text = input.nextLine();

        char [] symbols = text.toCharArray();

        for (char symbol : symbols) {
            System.out.println(symbol);
        }
    }
}
