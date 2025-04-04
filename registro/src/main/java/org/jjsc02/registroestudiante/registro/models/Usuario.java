package org.jjsc02.registroestudiante.registro.models;

public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private String rol; // ADMINISTRADOR, DOCENTE, ESTUDIANTE

    public Usuario(String nombre, String correo, String contraseña, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRol() {
        return rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
