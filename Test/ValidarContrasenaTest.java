package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ValidarContrasenaTest {
    @Test
    void testPasswordFuerte() {
        ValidarContrasena v = new ValidarContrasena();
        assertTrue(v.esFuerte("password123"));
    }

    @Test
    void testPasswordCorta() {
        ValidarContrasena v = new ValidarContrasena();
        assertFalse(v.esFuerte("pass1"));
    }

    @Test
    void testPasswordSinNumeros() {
        ValidarContrasena v = new ValidarContrasena();
        assertFalse(v.esFuerte("passwordlong"));
    }
}