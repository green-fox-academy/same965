package com.greenfoxacademy.todos.controllers;

import com.greenfoxacademy.todos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value = "todo")
public class WebController {

    public final TodoRepository todoRepository;

    @Autowired
    public WebController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/test"})
    public String worksFine() {
        return "index";
    }

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todoslist";
    }
}
