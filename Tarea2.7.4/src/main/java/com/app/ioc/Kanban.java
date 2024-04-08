package com.app.ioc;

public class Kanban {
    private GestorTareas gestorTareas;

    public Kanban(GestorTareas gestorTareas) {
        this.gestorTareas = gestorTareas;
    }

    public void ejecutar() {
        gestorTareas.realizarTareas();
        System.out.println("Ejecutando el kanban...");
    }
}
