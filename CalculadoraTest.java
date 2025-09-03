package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSumaPositivos() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.sumar(3, 4));
    }

}