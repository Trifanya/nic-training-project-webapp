package dev.trifanya.taskmanagementsystem.repository;

import dev.trifanya.taskmanagementsystem.model.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}