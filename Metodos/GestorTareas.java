package org.example;
import java.util.*;

public class GestorTareas {
    private List<String> tareas;

    public void agregarTarea(String tarea) {
        if (this.tareas == null) {
            this.tareas = new ArrayList<>();
        }
        this.tareas.add(tarea);
    }

    public List<String> obtenerTareas() {
        return tareas;
    }
}
