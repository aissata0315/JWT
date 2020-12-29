package sn.aissata.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sn.aissata.jwt.dao.TaskRepository;
import sn.aissata.jwt.entities.Task;

import java.util.List;

@RestController
public class TaskRestController {
    @Autowired
    private TaskRepository taskRepository;
    @GetMapping("/tasks")
    public List<Task> taskList(){
        return taskRepository.findAll();

    }
    @PostMapping("/tasks")
    public Task save(@RequestBody Task t){
        return taskRepository.save(t);
    }
}
