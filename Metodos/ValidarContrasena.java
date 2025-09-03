package org.example;

public class ValidarContrasena {
    public static boolean esFuerte(String password) {
        if (password == null || password.length() < 8)
            return false;

        return password.matches(".*\\d.*");
    }
}
