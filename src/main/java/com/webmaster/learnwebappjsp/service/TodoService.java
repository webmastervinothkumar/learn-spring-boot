package com.webmaster.learnwebappjsp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webmaster.learnwebappjsp.model.Todo;
import com.webmaster.learnwebappjsp.repository.TodoRepository;
@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void addTodo(String username, String name, String description, LocalDate targetDate, Boolean done) {
        Todo todo = new Todo(0, name, description, done, targetDate, username);
        todoRepository.save(todo);
    }

    public void deleteTodo(long id) {
        todoRepository.deleteById(id);
    }

    public Todo findById(long id) {
        return todoRepository.findById(id).get();
    }

    public void updateTodo(Todo todo, String userName) {
        Todo todoToBeUpdated = findById(todo.getId());
        todoToBeUpdated.setName(todo.getName());
        todoToBeUpdated.setDescription(todo.getDescription());
        todoToBeUpdated.setTargetDate(todo.getTargetDate());
        todoToBeUpdated.setDone(todo.isDone());
        todoToBeUpdated.setUsername(userName);
        todoRepository.save(todoToBeUpdated);
    }

    public List<Todo> findByUserName(String userName) {
        return todoRepository.findByUsername(userName);
    }
}
