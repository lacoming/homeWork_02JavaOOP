package Calculator;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.testng.AssertJUnit.assertEquals;

public class TestCalculator {

    private final Calculator calculator = new Calculator();

    @Test
    void addTest(){

        Properties prop = new Properties();
        FileInputStream input;

        try {
            input = new FileInputStream("src/Calculator/addTests.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        }
        try {
            prop.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Файл пуст");
        }

        double number1;
        double number2;
        double result;
        String error;

        number1 = Double.parseDouble(prop.getProperty("simple1"));
        number2 = Double.parseDouble(prop.getProperty("simple2"));
        result = Double.parseDouble(prop.getProperty("resultSimple"));

        assertEquals("Сложение выполнено неверно",result, calculator.add(number1, number2));

        number1 = Double.parseDouble(prop.getProperty("max"));
        number2 = 1.0;
        error = prop.getProperty("resultMax");

        assertEquals("Значение не вышло за рамки", error, calculator.add(number1, number2));

    }





}
