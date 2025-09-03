package org.example;

public class Palindromo {
    public static boolean esPalindromo(String palabra) {
        if (palabra == null)
            return false;
        String limpio = palabra.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(limpio).reverse().toString().equals(limpio);
    }
}
