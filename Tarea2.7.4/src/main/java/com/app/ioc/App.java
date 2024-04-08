package com.app.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Cargar el contexto de Spring desde el archivo beans.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // Obtener las instancias de Proyecto, EquipoDesarrollo y Sprint del contexto de Spring
        Proyecto proyecto = context.getBean(Proyecto.class);
        EquipoDesarrollador equipoDesarrollador = context.getBean(EquipoDesarrollador.class);
        Kanban kanban = context.getBean(Kanban.class);

        // Llamar a los métodos correspondientes de cada clase
        kanban.ejecutar();
        proyecto.realizarTareas();
        equipoDesarrollador.realizarDesarrollo();
        ((ClassPathXmlApplicationContext) context).close();

    }
}
