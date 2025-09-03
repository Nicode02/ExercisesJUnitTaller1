package org.example;

public class Factorial {
    public static int calcular(int n) {
        if (n < 0)
            throw new IllegalArgumentException("No funciona con negativos");
        if (n == 0)
            return 1;
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
