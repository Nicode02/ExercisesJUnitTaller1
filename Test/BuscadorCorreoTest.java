package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.example.usuario.UsuarioCorreo;
import org.junit.jupiter.api.Test;
import java.util.*;

class BuscadorCorreoTest {
    @Test
    void testUsuarioEncontrado() {
        List<UsuarioCorreo> usuarios = Arrays.asList(
                new UsuarioCorreo("Juan", "juan@gmail.com"),
                new UsuarioCorreo("Maria", "maria@gmail.com")
        );
        BuscadorCorreo buscador = new BuscadorCorreo();
        UsuarioCorreo u = buscador.buscarPorCorreo(usuarios,"juan@gmail.com");
        assertNotNull(u);
        assertEquals("Juan", u.getNombre());
    }

    @Test
    void testUsuarioNoEncontrado() {
        List<UsuarioCorreo> usuarios = Arrays.asList(
                new UsuarioCorreo("Juan", "juan@mail.com")
        );
        BuscadorCorreo buscador = new BuscadorCorreo();
        assertNull(buscador.buscarPorCorreo(usuarios, "noexiste@mail.com"));
    }

}