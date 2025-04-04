package org.jjsc02.registroestudiante.registro.services;

import org.jjsc02.registroestudiante.registro.models.Usuario;

import java.util.List;

public interface IUsuarioService {
    void agregarUsuario(Usuario usuario);
    List<Usuario> obtenerUsuarios();
    List<Usuario> obtenerDocentes();
    int contarDocentes();
    int contarEstudiantes();
}
