package ua.kupaiev.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = (int) (Math.random() * 100);
        //System.out.println(secret);
        int guess;
        System.out.println("Введите число: ");
        do {
            guess = scanner.nextInt();
            System.out.println(guess);
            if (guess > secret) {
                System.out.println("Много ");
            } else if (guess < secret) {
                System.out.println("Мало ");
            } else System.out.println("Угадал ");
        }
        while (guess != secret);
    }
}
