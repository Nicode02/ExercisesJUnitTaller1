package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PalindromoTest {

    @Test
    void testPalindromoValido() {
        Palindromo p = new Palindromo();
        assertTrue(p.esPalindromo("Anita lava la tina"));
    }

    @Test
    void testNoPalindromo() {
        Palindromo p = new Palindromo();
        assertFalse(p.esPalindromo("Filokallianthropía"));
    }

    @Test
    void testNull() {
        Palindromo p = new Palindromo();
        assertFalse(p.esPalindromo(null));
    }

}