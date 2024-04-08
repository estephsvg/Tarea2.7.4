package com.app.ioc;

public class EquipoDesarrollador {
    private GestorTareas gestorTareas;

    public EquipoDesarrollador(GestorTareas gestorTareas) {
        this.gestorTareas = gestorTareas;
    }

    public void realizarDesarrollo() {
        gestorTareas.realizarTareas();
        System.out.println("Estamos realizando el desarrollo del producto...");
    }
}
