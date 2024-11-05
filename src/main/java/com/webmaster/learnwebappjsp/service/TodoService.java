package com.webmaster.learnwebappjsp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webmaster.learnwebappjsp.model.Todo;

import jakarta.validation.Valid;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    private static int todoCount = 0;

    static {
        todos.add(new Todo(++todoCount, "Learn Spring MVC", "Learn Spring MVC", false, LocalDate.now(), "in28Minutes"));
        todos.add(new Todo(++todoCount, "Learn Spring", "Learn Spring", false, LocalDate.now(), "in28Minutes"));
        todos.add(new Todo(++todoCount, "Learn JPA", "Learn JPA", false, LocalDate.now(), "in28Minutes"));
    }

    public List<Todo> findByUserName(String userName) {
        return todos;
    }

    public void addTodo(String username, String name, String description, LocalDate targetDate, Boolean done) {
        todos.add(new Todo(++todoCount, name, description, done, targetDate, username));
    }

    public void deleteTodo(long id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public Todo findById(long id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().get();
    }

    public void updateTodo(Todo todo) {
        Todo todoToBeUpdated = findById(todo.getId());
        todoToBeUpdated.setName(todo.getName());
        todoToBeUpdated.setDescription(todo.getDescription());
        todoToBeUpdated.setTargetDate(todo.getTargetDate());
        todoToBeUpdated.setDone(todo.isDone());
    }
}
