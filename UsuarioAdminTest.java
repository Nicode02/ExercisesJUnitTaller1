package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UsuarioAdminTest {

    @Test
    void testAdminDevuelveNull() {
        UsuarioAdmin u = new UsuarioAdmin();
        assertNull(u.obtenerUsuario("admin"));
    }

    @Test
    void testOtroUsuarioNoEsNull() {
        UsuarioAdmin u = new UsuarioAdmin();
        assertNotNull(u.obtenerUsuario("john"));
    }

}