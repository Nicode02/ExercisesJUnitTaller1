package org.example;
import java.util.*;
import org.example.usuario.UsuarioCorreo;

public class BuscadorCorreo {
    public UsuarioCorreo buscarPorCorreo(List<UsuarioCorreo> usuarios, String correo) {
        for (UsuarioCorreo u : usuarios) {
            if (u.getCorreo().equalsIgnoreCase(correo)) {
                return u;
            }
        }
        return null;
    }
}
