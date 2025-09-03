package org.example;

public class DescuentoTienda {
    public static double aplicarDescuento(double precio) {
        if (precio >= 100000) {
            precio = precio*0.9;
        }
        return precio;
    }
}
