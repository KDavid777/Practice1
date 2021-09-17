package ua.kupaiev.hw12.Exception;

public class Task3 {
    public static void main(String[] args) {
        try {
            throwThreeException("Саша");
        } catch (ExceptionFirst | ExceptionSecond | ExceptionThird exception) {
            exception.printStackTrace();
        }
    }

    public static void throwThreeException(String name) throws ExceptionFirst, ExceptionSecond, ExceptionThird {
        if (name.equals("Иван")) {
            throw new ExceptionFirst("Меня зовут Иван");
        }
        if (name.equals("Саша")) {
            throw new ExceptionSecond("Меня зовут Саша");
        } else {
            throw new ExceptionThird("Не нашел совпадений");
        }
    }
}


