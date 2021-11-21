package at.campus02.binaku;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    int a;


    @BeforeEach
    void setUp() {
        a = 1;
    }

    @Test
    void myFirstTest(){

        assertTrue(a > 0);

    }
}