package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialTest {
    @Test
    void testFactorial5() {
        Factorial f = new Factorial();
        assertEquals(120, f.calcular(5));
    }

    @Test
    void testFactorial0() {
        Factorial f = new Factorial();
        assertEquals(1, f.calcular(0));
    }

    @Test
    void testFactorialIncorrecto() {
        Factorial f = new Factorial();
        assertNotEquals(121, f.calcular(5));
    }
}