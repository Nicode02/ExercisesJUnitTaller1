package org.example;

public class UsuarioAdmin {
    public static String obtenerUsuario(String nombre) {
        if ("admin".equalsIgnoreCase(nombre)) {
            return null;
        }
        return nombre;
    }
}
