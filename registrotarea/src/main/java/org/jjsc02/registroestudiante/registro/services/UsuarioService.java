package org.jjsc02.registroestudiante.registro.services;

import org.jjsc02.registroestudiante.registro.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements IUsuarioService {
    private final List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    @Override
    public List<Usuario> obtenerDocentes() {
        return usuarios.stream()
                .filter(u -> "DOCENTE".equalsIgnoreCase(u.getRol()))
                .collect(Collectors.toList());
    }

    @Override
    public int contarDocentes() {
        return (int) usuarios.stream()
                .filter(u -> "DOCENTE".equalsIgnoreCase(u.getRol()))
                .count();
    }

    @Override
    public int contarEstudiantes() {
        return (int) usuarios.stream()
                .filter(u -> "ESTUDIANTE".equalsIgnoreCase(u.getRol()))
                .count();
    }
}
