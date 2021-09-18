package ua.kupaiev.hw14;

import java.util.Arrays;
import java.util.List;

public class Util<T> implements Multiplier<T> {
    T value;

    public void printHashCode(T e) {
        System.out.println("HashCode: " + e.hashCode());
    }

    public void save(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }


    public <T extends Double> void sum(T one, T two) { // should work only with numbers
        System.out.println(one.doubleValue() + two.doubleValue());
    }

    public double sumOfArray(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }

    public void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    @Override
    public <S extends Number> Number[] doubleValueIn(S[] array) {
        Number[] newArray = new Number[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i].doubleValue() * array[i].doubleValue();
        }
        return newArray;
    }
}
