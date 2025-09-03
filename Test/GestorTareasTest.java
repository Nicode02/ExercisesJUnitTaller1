package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GestorTareasTest {
    @Test
    void testSinTareasDevuelveNull() {
        GestorTareas g = new GestorTareas();
        assertNull(g.obtenerTareas());
    }

    @Test
    void testConTareasNoEsNull() {
        GestorTareas g = new GestorTareas();
        g.agregarTarea("Hacer taller");
        assertNotNull(g.obtenerTareas());
    }
}