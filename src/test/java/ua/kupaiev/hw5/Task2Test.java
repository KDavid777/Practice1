package ua.kupaiev.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task2Test {
    @Test
    void isTrueTest() {
        assertTrue(Task2.number1(new int[]{1345, 454, 355, -33}));
        assertTrue(Task2.number1(new int[]{100, -150, -1436, Integer.MIN_VALUE}));
        assertTrue(Task2.number1(new int[]{10, 0, 0, -5}));
    }

    @Test
    void isFalseTest() {
        assertFalse(Task2.number1(new int[]{-124, 1, 1, -33}));
        assertFalse(Task2.number1(new int[]{-125, 0, -1, -1254, Integer.MIN_VALUE}));
        assertFalse(Task2.number1(new int[]{-124, 0, 0, -1}));
    }

    @Test
    void isNullArray() {
        assertFalse(Task2.number1(new int[]{}));
        assertFalse(Task2.number1(new int[]{}));
        assertFalse(Task2.number1(new int[]{}));
    }

    @Test
    void isSameNumbers() {
        assertTrue(Task2.number1(new int[]{21, 21, 21, 21, 21, 21, 21}));
        assertTrue(Task2.number1(new int[]{0, 0, 0, 0, 0, 0, 0, 0}));
        assertTrue(Task2.number1(new int[]{-5, -5, -5, -5, -5, -5}));
    }
}