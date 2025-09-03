package org.example.usuario;

public class UsuarioCorreo {
    private String nombre;
    private String correo;

    public UsuarioCorreo(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}
