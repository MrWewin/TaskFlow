package taskflow_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import taskflow_backend.model.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Long> {

}