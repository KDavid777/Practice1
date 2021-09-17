package ua.kupaiev.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести строку: ");
        String text = scanner.nextLine();
        String text2 = text.replaceAll("[0-9]", "");
        String text3 = text2.trim().replaceAll(" +", " ");
        int count = 0;
        if (text3.length() != 0) {
            count++;
            for (int i = 0; i < text3.length(); i++) {
                if (text3.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(text2);
        System.out.println(count);
    }
}
