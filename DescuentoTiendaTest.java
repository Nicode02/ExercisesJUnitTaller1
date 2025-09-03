package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DescuentoTiendaTest {
    @Test
    void testConDescuento() {
        DescuentoTienda t = new DescuentoTienda();
        assertEquals(180000.0, t.aplicarDescuento(200000));
    }

    @Test
    void testSinDescuento() {
        DescuentoTienda t = new DescuentoTienda();
        assertEquals(90000, t.aplicarDescuento(90000));
    }
}