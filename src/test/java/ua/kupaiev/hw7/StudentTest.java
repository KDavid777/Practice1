package ua.kupaiev.hw7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    protected Student student1;
    protected Student student2;

    @BeforeEach
    void setUp() {
        student1 = new Student("", "", "", 5);
        student2 = new Student("", "", "", 4);
    }
    @Test
    void testGetScholarship() {
        Assertions.assertEquals(100, student1.getScholarship());
        Assertions.assertEquals(80, student2.getScholarship());

    }
}