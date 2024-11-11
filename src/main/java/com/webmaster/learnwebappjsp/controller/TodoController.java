package com.webmaster.learnwebappjsp.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.webmaster.learnwebappjsp.model.Todo;
import com.webmaster.learnwebappjsp.service.TodoService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("username")
public class TodoController {

    @Autowired
    private TodoService todoService;
     @RequestMapping("/list-todos")
        public String listTodos(ModelMap model) {
            model.addAttribute("todos", todoService.findByUserName(model.get("username").toString()));
            return "list-todos";
        }

        @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
        public String showAddTodoPage(ModelMap model) {
            String username = (String) model.get("username");
            model.addAttribute("todo", new Todo(0, "", "", false, LocalDate.now(), username));
            return "todo";
        }

        @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
        public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

            if(result.hasErrors()) {
                return "todo";
            }
            
            String username = (String) model.get("username");
            todoService.addTodo(username, todo.getName(), todo.getDescription(), todo.getTargetDate(), false);
            return "redirect:list-todos";
        }

        @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
        public String deleteTodo(@RequestParam("id") long id) {
            todoService.deleteTodo(id);
            return "redirect:list-todos";
        }

        @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
        public String showUpdateTodoPage(@RequestParam("id") long id, ModelMap model) {
            Todo todo = todoService.findById(id);
            model.put("todo", todo);
            return "update-todo";
        }

        @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
        public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

            if(result.hasErrors()) {
                return "update-todo";
            }
            
            String username = (String) model.get("username");
            todoService.updateTodo(todo);
            return "redirect:list-todos";
        }
}
