package ua.kupaiev.hw4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[] numbersArray = new int[1000];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = new Random().nextInt(2000);
        }
        System.out.println(Arrays.toString(numbersArray));
        System.out.print("Cоставных чисел: ");
        System.out.println(1000 - countPrimeNumbers(numbersArray));
    }

    private static int countPrimeNumbers(int[] numbersArray) {
        int amount = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i]>=2 && isPrimeNumber(numbersArray[i])){
                amount++;
            }
        }
        return amount;
    }
    private static boolean isPrimeNumber(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
