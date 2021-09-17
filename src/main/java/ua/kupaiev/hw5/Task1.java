package ua.kupaiev.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] numbersArray = new int[4][3];
        int s = 1;
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println();
            for (int j = 0; j < numbersArray[i].length; j++) {
                if (i % 2 != 0) {
                    numbersArray[i][j] = -s;
                }
                else {
                    numbersArray[i][j] = s;
                }
                s++;
                System.out.print(numbersArray[i][j]);
                System.out.print(" ");
            }

        }
    }
}
