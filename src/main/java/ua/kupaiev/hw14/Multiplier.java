package ua.kupaiev.hw14;

public interface Multiplier<T> {
        <S extends Number> Number[] doubleValueIn(S[] array);
}
