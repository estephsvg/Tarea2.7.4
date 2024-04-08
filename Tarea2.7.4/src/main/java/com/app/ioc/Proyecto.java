package com.app.ioc;

public class Proyecto {
	private GestorTareas gestorTareas;

	public Proyecto(GestorTareas gestorTareas) {
		this.gestorTareas = gestorTareas;
	}
	
	public void realizarTareas() {
		gestorTareas.realizarTareas();
		System.out.println("Realizando tareas!!!");
		
	}

}
