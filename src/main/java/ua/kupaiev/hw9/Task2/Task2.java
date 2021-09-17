package ua.kupaiev.hw9.Task2;

public class Task2 {
    public static void main(String[] args) {

        Pow power = (int number, int pow) -> {
            int result = 1;
            for (int i = 1; i <= pow; i++) {
                result = result * number;
            }
            return result;
        };
        System.out.println(power.pow(55, 5));
    }
}
