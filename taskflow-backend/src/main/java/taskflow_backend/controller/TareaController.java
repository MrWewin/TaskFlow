package taskflow_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import taskflow_backend.model.Tarea;
import taskflow_backend.service.TareaService;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping
    public List<Tarea> obtenerTodas() {
        return tareaService.obtenerTodas();
    }

    @PostMapping
    public Tarea guardar(@RequestBody Tarea tarea) {
        return tareaService.guardar(tarea);
    }
}