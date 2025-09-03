package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConcatenarCadenasTest {
    @Test
    void testConcatenacionCorrecta() {
        ConcatenarCadenas c = new ConcatenarCadenas();
        assertEquals("JUnit5", c.concatenar("JUnit", "5"));
    }

    @Test
    void testConcatenacionIncorrecta() {
        ConcatenarCadenas c = new ConcatenarCadenas();
        assertNotEquals("hola mundo ", c.concatenar("hola", "mundo"));
    }

}