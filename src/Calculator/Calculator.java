package Calculator;

import java.security.InvalidParameterException;

public class Calculator {

    private static double result; // TODO: Impl me!

    private static final double MAX_VALUE = Double.MAX_VALUE;
    private static final double MIN_VALUE = Double.MIN_VALUE;

    public double add(double a, double b){

        result = a + b;

        if (result > MAX_VALUE){
            throw new ArithmeticException("Слишком большое число");
        }
        return result;
    }

    public double sub(double a, double b){

        result = a - b;

        // if (result < MIN_VALUE){
        //  throw new ArithmeticException("Слишком маленькое число");
        // }
        // TODO: Разобраться почему не работает

        return result;
    }

    public double mul(double a, double b){

        result = a * b;

       /* if (result > MAX_VALUE){
            throw new ArithmeticException("Слишком большое число");
        }

        if (result < MIN_VALUE){
            throw new ArithmeticException("Слишком маленькое число");
        }*/

        return result;
    }

    public double div(double a, double b){
        if(b == 0){
            throw new InvalidParameterException("Error: b == 0");
        }
        return a/b;
    }

    public double pow(double a, double pow){
        // TODO: Impl me!
        // Math or cycle

        result = Math.pow(a, pow);

        if (result > MAX_VALUE){
            throw new ArithmeticException("Слишком большое число");
        }

        return result;
    }

    public double sqr(double a){
        if (a < 0){
            throw new ArithmeticException("Число меньше нуля");
        }
        return Math.sqrt(a);
    }

    public void calculation(){

    }

}
