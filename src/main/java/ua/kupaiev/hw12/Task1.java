package ua.kupaiev.hw12;

public class Task1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Was in block finally ");
        }
    }
}
