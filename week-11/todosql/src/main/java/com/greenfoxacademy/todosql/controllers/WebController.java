package com.greenfoxacademy.todosql.controllers;

import com.greenfoxacademy.todosql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller(value = "todo")
public class WebController {

    public final TodoService todoService;

    @Autowired
    public WebController(TodoService todoService) {
        this.todoService = todoService;
        todoService.create();
    }

    @GetMapping(value = {"/", "/test"})
    public String worksFine() {
        return "index";
    }

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("todos", todoService.listTodos());
        return "todoslist";
    }

    @RequestMapping("todo/")
    public String listUndone(@RequestParam("isActive") boolean isActive, Model model) {
        model.addAttribute("undone", todoService.listUnDoneTodos(isActive));
        return "undonelist";
    }

    @GetMapping("todo/add")
    public String newTodo() {
        return "addtodo";
    }

    @PostMapping("newtodo")
    public String addNewTodo(@ModelAttribute(value = "title") String title,
                             @ModelAttribute(value = "urgent") boolean urgent,
                             @ModelAttribute(value = "done") boolean done) {
        todoService.saveFromForm(title, urgent, done);
        return "redirect:/list";
    }
}
