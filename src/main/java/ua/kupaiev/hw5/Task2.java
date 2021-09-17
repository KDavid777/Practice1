package ua.kupaiev.hw5;

public class Task2 {
    public static void main(String[] args) {
        int[] numbersArray = {52, 40, 22, 10};

        System.out.println("Данный массив отсортировон по убыванию: " + number1(numbersArray));
    }

    public static boolean number1(int[] number) {
        boolean check = false;
        for (int i = 1; i < number.length; i++) {
            if (number[i] <= number[i-1]) {
                check = true;
            } else {
                check = false;
                return check;
            }
        }
        return check;
    }
}