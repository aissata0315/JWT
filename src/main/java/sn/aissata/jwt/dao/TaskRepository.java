package sn.aissata.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.aissata.jwt.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
