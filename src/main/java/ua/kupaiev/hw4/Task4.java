package ua.kupaiev.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbersArray = new int[1000];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = new Random().nextInt(2000);
        }
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(Arrays.toString(countPrimeNumbers(numbersArray)));
    }

    private static int[] countPrimeNumbers(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++ ){
            if (numbersArray[i] % 2 == 0) {
                numbersArray[i] = 0;
            }
        }
        return numbersArray;
    }
}