package ua.kupaiev.hw2;

public class Task2 {

    public static void main(String[] args) {
        hashCode1();
    }
    private static void hashCode1() {
        int[] A = new int[2];
        A[0] = 3; //Это х1
        A[1] = 0; //Это у1
        int[] B = new int[2];
        B[0] = 1; //Это х2
        B[1] = 5; //Это у2
        int[] C = new int[2];
        C[0] = 6; //Это х3
        C[1] = 0; //Это у3
        double S = Math.abs((B[0] - A[0]) * (C[1] - A[1]) - (C[0] - A[0]) * (B[1] - A[1]));
        double a = S / 2;
        System.out.print(a);
    }
}
