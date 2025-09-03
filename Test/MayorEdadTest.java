package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MayorEdadTest {

    @Test
    void testMayorEdad() {
        MayorEdad persona = new MayorEdad();
        assertTrue(persona.esMayorDeEdad(25));
    }

    @Test
    void testMenorEdadFalse() {
        MayorEdad persona = new MayorEdad();
        assertFalse(persona.esMayorDeEdad(17));
    }

}