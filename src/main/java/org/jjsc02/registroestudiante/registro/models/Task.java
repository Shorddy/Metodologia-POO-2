package org.jjsc02.registroestudiante.registro.models;

public class Task {

        private String nombre;
        private String descripcion;
        private String status;

    public Task(String nombre, String descripcion, String status) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.status = status;

    }

    @Override
    public String toString() {
        return "Task{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}


