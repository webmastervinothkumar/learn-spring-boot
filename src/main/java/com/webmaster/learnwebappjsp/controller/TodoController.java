package com.webmaster.learnwebappjsp.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.webmaster.learnwebappjsp.service.TodoService;

@Controller
@RequestMapping("/webapp")
@SessionAttributes("username")
public class TodoController {

    @Autowired
    private TodoService todoService;
     @RequestMapping("/list-todos")
        public String listTodos(ModelMap model) {
            model.addAttribute("todos", todoService.findByUserName("in28Minutes"));
            return "list-todos";
        }

        @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
        public String showAddTodoPage() {
            return "todo";
        }

        @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
        public String addTodo(@RequestParam String name, @RequestParam String description, @RequestParam String targetDate, ModelMap model) {
            String username = (String) model.get("username");
            todoService.addTodo(username, name, description, LocalDate.parse(targetDate), false);
            return "redirect:list-todos";
        }
}
