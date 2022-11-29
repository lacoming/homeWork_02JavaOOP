package Calculator;

import org.testng.annotations.BeforeMethod;
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

    @BeforeMethod
    void readingPropertiesFile (){

        try {
            input = new FileInputStream("src/Calculator/Tests.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        }
        try {
            prop.load(input);
            number1 = Double.parseDouble(prop.getProperty("simple1"));
            number2 = Double.parseDouble(prop.getProperty("simple2"));
        } catch (IOException e) {
            throw new RuntimeException("Файл пуст");
        }
    }

    @Test
    void addTestSimple(){

        result = Double.parseDouble(prop.getProperty("resultSimpleAdd"));
        assertEquals("Сложение выполнено неверно",result, calculator.add(number1, number2));
    }

    @Test
    void addTestMaxOne(){

        number1 = Double.parseDouble(prop.getProperty("max"));
        assertEquals("Значение не вышло за рамки", number1, calculator.add(number1, 1.0));
    }


    @Test
    void addTestMaxMax(){

        error = prop.getProperty("resultMax");
        number1 = Double.parseDouble(prop.getProperty("max"));
        try {
            assertEquals("Значение не вышло за рамки", error, calculator.add(number1, number1));
        } catch (ArithmeticException ex){
            System.out.println("Выброшено исключение: слишком большое число");
        }

    }

    @Test
    void subTestSimple(){

        result = Double.parseDouble(prop.getProperty("resultSimpleSub"));
        assertEquals("Вычитание неверное", result, calculator.sub(number1, number2));

    }

    @Test
    void subTestSimpleMinus(){

        number2 = Double.parseDouble(prop.getProperty("simple3"));
        result = Double.parseDouble(prop.getProperty("resultSimpleSub2"));
        assertEquals("Вычитание неверное", result, calculator.sub(number1, number2));

    }

    @Test
    void subTestMin(){

        number1 = Double.parseDouble(prop.getProperty("min"));
        result = Double.parseDouble(prop.getProperty("resultMin"));

        try {
            assertEquals("Минимум не пробит", result, calculator.sub(number1, 1.0));
        } catch (ArithmeticException ex){
            System.out.println("Выброшено исключение: слишком маленькое число");
        }

    }

    @Test
    void mulTestSimple(){

        result = Double.parseDouble(prop.getProperty("resultSimpleMul"));
        assertEquals("Умножение неверное", result, calculator.mul(number1, number2));

    }

    @Test
    void mulTestSimpleMinus(){

        number1 = Double.parseDouble(prop.getProperty("simple3"));
        result = Double.parseDouble(prop.getProperty("resultSimpleMul2"));
        assertEquals("Умножение с отрицательным числом неверное", result, calculator.mul(number1, number2));

    }

    @Test
    void mulTestSimpleDoubleMinus(){

        number1 = Double.parseDouble(prop.getProperty("simple3"));
        result = Double.parseDouble(prop.getProperty("resultSimpleMul3"));
        assertEquals("Умножение с отрицательным числом неверное", result, calculator.mul(number1, number1));

    }

    @Test
    void mulTestInfinity(){

        number1 = Double.parseDouble(prop.getProperty("max"));
        result = Double.parseDouble(prop.getProperty("resultMax"));
        assertEquals("Бесконечность не вышла", result, calculator.mul(number1, number1));

    }


    @Test
    void divTestSimple(){

        result = Double.parseDouble(prop.getProperty("resultSimpleDiv"));
        assertEquals("Обычное деление не вышло", result, calculator.div(number1, number2));

    }

    @Test
    void divTestSimpleMinus(){

        number1 = Double.parseDouble(prop.getProperty("simple3"));
        number2 = Double.parseDouble(prop.getProperty("simple4"));
        result = Double.parseDouble(prop.getProperty("resultSimpleDiv2"));
        assertEquals("Деление с отрицательным числом не вышло", result, calculator.div(number1, number2));

    }

    @Test
    void divTestZeroFirst(){

        number1 = Double.parseDouble(prop.getProperty("zero"));
        result = Double.parseDouble(prop.getProperty("zero"));
        assertEquals("Не смогли разделить ноль", result, calculator.div(number1, number2));

    }

    @Test
    void divTestZeroSecond(){
        try {
            number2 = Double.parseDouble(prop.getProperty("zero"));
            result = Double.parseDouble(prop.getProperty("resultSimpleDiv2"));
        } catch (ArithmeticException exception){
            System.out.println("На ноль делить нельзя!");
        }
    }

    @Test
    void powTestSimple(){

        number2 = Double.parseDouble(prop.getProperty("simple4"));
        result = Double.parseDouble(prop.getProperty("resultSimplePow"));
        assertEquals("Возведение в степень неверное", result, calculator.pow(number1, number2));

    }

    @Test
    void powTestMinus(){

        number2 = Double.parseDouble(prop.getProperty("simple3"));
        result = Double.parseDouble(prop.getProperty("resultMinusPow"));
        assertEquals("Возведение в отрицательную степень неверное", result, calculator.pow(number1, number2));

    }

    @Test
    void powTestZero(){

        number2 = Double.parseDouble(prop.getProperty("zero"));
        result = Double.parseDouble(prop.getProperty("resultZeroPow"));
        assertEquals("Возведение в нулевую степень неверное", result, calculator.pow(number1, number2));

    }

    @Test
    void powTesNotIneger(){

        number2 = Double.parseDouble(prop.getProperty("notInteger"));
        result = Double.parseDouble(prop.getProperty("resultNotIntegerPow"));
        assertEquals("Возведение в нулевую степень неверное", result, calculator.pow(number1, number2));

    }

    @Test
    void powTestMaxMax(){

        error = prop.getProperty("resultMax");
        number1 = Double.parseDouble(prop.getProperty("max"));
        try {
            assertEquals("Значение не вышло за рамки", error, calculator.pow(number1, number1));
        } catch (ArithmeticException ex){
            System.out.println("Выброшено исключение: слишком большое число");
        }

    }

    @Test
    void sqrTestSimple(){

        number1 = Double.parseDouble(prop.getProperty("simple5"));
        result = Double.parseDouble(prop.getProperty("resultSimpleSqr"));
        assertEquals("Корень не извлечён", result, calculator.sqr(number1));

    }

    @Test
    void sqrTestNotSimple(){

        number1 = Double.parseDouble(prop.getProperty("simple4"));
        result = Double.parseDouble(prop.getProperty("resultNotSimpleSqr"));
        assertEquals("Корень не извлечён", result, calculator.sqr(number1));

    }

    @Test
    void sqrTestZero(){

        number1 = Double.parseDouble(prop.getProperty("zero"));
        result = Double.parseDouble(prop.getProperty("zero"));
        assertEquals("Корень не извлечён", result, calculator.sqr(number1));

    }

    @Test
    void sqrTestMinusNumber(){

        number1 = Double.parseDouble(prop.getProperty("simple3"));
        try {
            assertEquals("Чудом корень извлёкся", error, calculator.sqr(number1));
        } catch (ArithmeticException ex){
            System.out.println("Выброшено исключение: нельзя извлекать корень из отрицательного числа");
        }

    }

}
