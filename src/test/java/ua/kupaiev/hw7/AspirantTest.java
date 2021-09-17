package ua.kupaiev.hw7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AspirantTest {
    protected Aspirant aspirant1;
    protected Aspirant aspirant2;

    @BeforeEach
    void setUp() {
        aspirant1 = new Aspirant("", "", "", 5, "");
        aspirant2 = new Aspirant("", "", "", 4, "");
    }
    @Test
    void testGetScholarship() {
        Assertions.assertEquals(200, aspirant1.getScholarship());
        Assertions.assertEquals(180, aspirant2.getScholarship());

    }
}