package Calculator;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.testng.AssertJUnit.assertEquals;

public class TestCalculator {

    private final Calculator calculator = new Calculator();

    Properties prop = new Properties();
    FileInputStream input;
    private double number1;
    private double number2;
    private double result;
    private String error;


    @Test
    void addTest(){

        try {
            input = new FileInputStream("src/Calculator/Tests.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        }
        try {
            prop.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Файл пуст");
        }

        number1 = Double.parseDouble(prop.getProperty("simple1"));
        number2 = Double.parseDouble(prop.getProperty("simple2"));
        result = Double.parseDouble(prop.getProperty("resultSimpleAdd"));

        assertEquals("Сложение выполнено неверно",result, calculator.add(number1, number2));

        number1 = Double.parseDouble(prop.getProperty("max"));

        error = prop.getProperty("resultMax");

        assertEquals("Значение не вышло за рамки", number1, calculator.add(number1, 1.0));

        try {
            assertEquals("Значение не вышло за рамки", error, calculator.add(number1, number1));
        } catch (ArithmeticException ex){
            System.out.println("Выброшено исключение: слишком большое число");
        }

    }

    @Test
    void subTest(){

        try {
            input = new FileInputStream("src/Calculator/Tests.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        }
        try {
            prop.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Файл пуст");
        }

        number1 = Double.parseDouble(prop.getProperty("simple1"));
        number2 = Double.parseDouble(prop.getProperty("simple2"));
        result = Double.parseDouble(prop.getProperty("resultSimpleSub"));

        assertEquals("Вычитание неверное", result, calculator.sub(number1, number2));

        number2 = Double.parseDouble(prop.getProperty("simple3"));
        result = Double.parseDouble(prop.getProperty("resultSimpleSub2"));

        assertEquals("Вычитание неверное", result, calculator.sub(number1, number2));

        number1 = Double.parseDouble(prop.getProperty("min"));
        result = Double.parseDouble(prop.getProperty("resultMin"));

        try {
            assertEquals("Минимум не пробит", result, calculator.sub(number1, 1.0));
        } catch (ArithmeticException ex){
            System.out.println("Выброшено исключение: слишком маленькое число");
        }

    }

    @Test
    void mulTest(){
        try {
            input = new FileInputStream("src/Calculator/Tests.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        }
        try {
            prop.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Файл пуст");
        }

        number1 = Double.parseDouble(prop.getProperty("simple1"));
        number2 = Double.parseDouble(prop.getProperty("simple2"));
        result = Double.parseDouble(prop.getProperty("resultSimpleMul"));

        assertEquals("Умножение неверное", result, calculator.mul(number1, number2));

        number1 = Double.parseDouble(prop.getProperty("simple3"));
        result = Double.parseDouble(prop.getProperty("resultSimpleMul2"));

        assertEquals("Умножение с отрицательным числом неверное", result, calculator.mul(number1, number2));

        result = Double.parseDouble(prop.getProperty("resultSimpleMul3"));
        assertEquals("Умножение с отрицательным числом неверное", result, calculator.mul(number1, number1));

        number1 = Double.parseDouble(prop.getProperty("max"));
        result = Double.parseDouble(prop.getProperty("resultMax"));

        assertEquals("Бесконечность не вышла", result, calculator.mul(number1, number1));

    }


    @Test
    void divTest(){

    }


}
