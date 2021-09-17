package ua.kupaiev.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbersArray = new int[4][4];
        int s = 1;
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println();
            for (int j = 0; j < numbersArray[i].length; j++) {
                numbersArray[i][j] = s++;
                System.out.print(numbersArray[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int[] t : rotateArray(numbersArray)) {
            System.out.println(Arrays.toString(t));
        }
    }

    private static int[][] rotateArray(int[][] args) {
        int[][] board = new int[args[0].length][args.length];
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                board[j][i] = args[i][j];
            }
        }
        return board;
    }
}
