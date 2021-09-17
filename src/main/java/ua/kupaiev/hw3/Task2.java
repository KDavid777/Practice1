package ua.kupaiev.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести строку: ");
        String text = scanner.nextLine();
        System.out.println(text);
        String filteredText = space(text);
        System.out.println(filteredText);
        System.out.println(palindrome(filteredText));
    }

    private static String space(String text) {
        String strWithoutSpace2 = text.replaceAll("\\s+", "");
        return strWithoutSpace2;

    }

    private static boolean palindrome(String strWithoutSpace2) {
        StringBuilder buffer = new StringBuilder(strWithoutSpace2);
        buffer.reverse();
        String reversed = buffer.toString();
        System.out.println(reversed);
        return reversed.equalsIgnoreCase(strWithoutSpace2) ;
    }
}