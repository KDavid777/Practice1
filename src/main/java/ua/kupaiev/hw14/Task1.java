package ua.kupaiev.hw14;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

    }
}
/*
}

class Util <T> implements Multiplier <T>{
    <T> value;

    public <T> void printHashCode(T e) {
        System.out.println("HashCode: " + e.hashCode());
    }

    public void save(Object value) {
        this.value = value;
    }

    public <T> get() {
        return value;
    }

    @Override
    public <T>[] doubleValueIn(T[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        return array;
    }

    public void sum(T one, T two) { // should work only with numbers
        System.out.println(one + two);
    }

    public double sumOfArray(List<T> list) {
        double s = 0.0;
        for (T n : list) {
            s += n;
        }
        return s;
    }

    public <T>void addNumbers(List<T> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}

interface <T> Multiplier {
    T[] doubleValueIn(T[] array);
}

public class Test {
    public static <T>void main(String[] args) {
        Util<T> util = new Util<T>();
        util.printHashCode("Test");
        util.save("Value");
        System.out.println(util.get());
        Number[] arr = {1, 2, 3, 4, 0, 5, 6, 7};
        System.out.println(Arrays.toString(util.doubleValueIn(arr)));
        System.out.println(util.sumOfArray(Arrays.asList(arr)));
        List<T> list = new ArrayList<T>();
        util.addNumbers(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
*/

