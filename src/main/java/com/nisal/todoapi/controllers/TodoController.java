package com.nisal.todoapi.controllers;

import com.nisal.todoapi.entities.Todo;
import com.nisal.todoapi.entities.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoRepository todoRepository;
    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }


    @PostMapping
    public Todo newTodo(@RequestBody Todo todo){
        return this.todoRepository.save(todo);
    }
}
