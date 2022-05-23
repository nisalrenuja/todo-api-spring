package com.nisal.todoapi.entities;

import com.nisal.todoapi.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}