package Additional_Tasks.Additional_Tasks_Massive;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-5, 5);
            System.out.println(array[i]);
        }

        int positive = 0;
        int sumIndex = 0;
        int sumHonest = 0;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positive++;
            }
            if (i % 2 == 0){
                sumIndex = sumIndex + array[i];
            }
            if (array[i] % 2 == 0){
                sumHonest = sumHonest + array[i];
            }
            if (max < array[i]){
                max = array[i];
            }
        }

        System.out.println("Количество положительных чисел: " + positive);
        System.out.println("Количество отрицательных чисел: " + (array.length - positive));
        System.out.println("Сумма элементов с чётными индексами равна: " + sumIndex);
        System.out.println("Сумма чётных элементов равна: " + sumHonest);
        System.out.println("Наибольшее число в массиве: " + max);

        int oftenCount = array[0];
        int count = 1;
        int count2 = 0;

        for (int i = 0; i < array.length - 1; i++){
            for (int j = (i + 1); j < array.length; j++){
                if (array [i] == array [j]){
                    count2++;
                }
            }
            if (count < count2){
                count = count2;
                oftenCount = array [i];
            }
            else {
                if (count == count2 && oftenCount < array [i]) {
                    oftenCount = array [i];
                }
            }
            count2 = 0;
        }
        if (count > 1) {
            System.out.println(oftenCount + " встретился " + (count + 1) + " раз");
        }
        else
            System.out.println("Повторяющихся чисел не встретилось");
    }
}