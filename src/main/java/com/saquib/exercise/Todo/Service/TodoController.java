package com.saquib.exercise.Todo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/")
    public Collection<Todo> list(){
        return todoRepository.findAll();
    }

    @PostMapping("/")
    @PutMapping("/")
    public void add(@RequestBody Todo todo){
        todoRepository.save(todo);
    }
}
