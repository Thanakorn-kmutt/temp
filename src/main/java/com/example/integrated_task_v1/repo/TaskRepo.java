package com.example.integrated_task_v1.repo;

import com.example.integrated_task_v1.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TaskRepo extends JpaRepository<Task, Integer> {

}
