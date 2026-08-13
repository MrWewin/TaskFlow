package taskflow_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import taskflow_backend.model.Tarea;
import taskflow_backend.repository.TareaRepository;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<Tarea> obtenerTodas() {
        return tareaRepository.findAll();
    }

    public Tarea guardar(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public void eliminar(Long id) {
        tareaRepository.deleteById(id);
    }
}