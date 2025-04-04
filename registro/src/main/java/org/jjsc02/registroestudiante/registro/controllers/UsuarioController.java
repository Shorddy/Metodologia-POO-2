package org.jjsc02.registroestudiante.registro.controllers;

import org.jjsc02.registroestudiante.registro.models.Usuario;
import org.jjsc02.registroestudiante.registro.services.IUsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Registrar usuario
    @PostMapping("/add")
    public Map<String, String> addUser(@RequestBody Usuario usuario) {
        usuarioService.agregarUsuario(usuario);
        return Map.of("message", "Usuario registrado correctamente");
    }

    // Listar todos los usuarios
    @GetMapping
    public List<Usuario> getUsers() {
        return usuarioService.obtenerUsuarios();
    }

    // Listar solo docentes
    @GetMapping("/docentes")
    public List<Usuario> getDocentes() {
        return usuarioService.obtenerDocentes();
    }

    // Contar docentes y estudiantes
    @GetMapping("/count")
    public Map<String, Integer> countDocentesYEstudiantes() {
        Map<String, Integer> count = new HashMap<>();
        count.put("docentes", usuarioService.contarDocentes());
        count.put("estudiantes", usuarioService.contarEstudiantes());
        count.put("total", usuarioService.contarDocentes() + usuarioService.contarEstudiantes());

        return count;
    }
}
