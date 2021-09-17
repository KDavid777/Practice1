package ua.kupaiev.hw4;

import java.math.*;
import java.util.Random;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] numbersArray = new int[400];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = new Random().nextInt(10)+1;
        }
        System.out.println(Arrays.toString(numbersArray));
        System.out.println("Cреднее арефметическое: " + (average(numbersArray)));
        System.out.println("Cреднее геометрическое: " + (geometricMean(numbersArray)));
    }

    private static double average(int[] numbersArray) {
        double sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sum += numbersArray[i];
        }
        sum /= numbersArray.length;
        return sum;
    }

    private static double geometricMean(int[] numbersArray) {
        double product = 1;
        for (int i = 0; i < numbersArray.length; i++) {
            product = product * numbersArray[i];
        }
        double gm = Math.pow(product, (double) 1 / numbersArray.length);
        return gm;
    }
}