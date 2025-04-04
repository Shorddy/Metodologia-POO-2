package org.jjsc02.registroestudiante.registro.controllers;


import org.jjsc02.registroestudiante.registro.models.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UsuarioController {
    //Listado de tareas
    private final ArrayList<Task> tasks = new ArrayList<>();
    //Agregar tareas a la lista
    @PostMapping("/addtask")
    public Map<String, String> addTask(@RequestBody Map<String, String> request) {

        String name = request.get("name");
        String description = request.get("description");
        String status = request.get("status");
        Task task = new Task(name, description, status);
        tasks.add(task);


        Map<String, String> response = Map.of(
                "message", "Tarea agregada correctamente",
                "task", tasks.toString()
        );
        return response;
    }

    //Listar todas la tareas
    @GetMapping("/tasks")
    public Map<String,String> getTask(){

    Map<String, String> json = new HashMap<>();
    json.put("task", tasks.toString());



        return json;
    }
}
