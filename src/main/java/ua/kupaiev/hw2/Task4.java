package ua.kupaiev.hw2;

public class Task4 {
    public static void main(String[] args) {
        hashCode1();
    }

    private static void hashCode1() {
        int i, i1, k, k1, n, n1;
        i = 5;
        k = -4;
        n = -9;
        i1 = i < 0 ? -i : i;
        k1 = k < 0 ? -k : k;
        n1 = n < 0 ? -n : n;
        if (i1 <= k1 && i1 <= n1) {
            System.out.println(i1);
        } else if (k1 <= n1 && k1 <= i1) {
            System.out.println(k1);
        } else {
            System.out.println(n1);
        }
    }
}
