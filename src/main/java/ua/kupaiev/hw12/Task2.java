package ua.kupaiev.hw12;

public class Task2 {
    public static void main(String[] args) {
        try {
            f();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void g() throws Exception {
        throw new Exception("Исключение 1");
    }

    public static void f() {
        try {
            g();
        } catch (Exception e) {
            throw new RuntimeException("Исключение 2");
        }
    }
}