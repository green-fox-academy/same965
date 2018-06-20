package com.greenfoxacademy.todosql.controllers;

import com.greenfoxacademy.todosql.services.TodoService;
import com.greenfoxacademy.todosql.services.TodoServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "todo")
public class WebController {

    public final TodoServiceInt todoServiceInt;

    @Autowired
    public WebController(TodoServiceInt todoServiceInt) {
        this.todoServiceInt = todoServiceInt;
        todoServiceInt.create();
    }

    @GetMapping(value = {"/", "/test"})
    public String worksFine() {
        return "index";
    }

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("todos", todoServiceInt.listTodos());
        return "todoslist";
    }

    @RequestMapping("todo/")
    public String listUndone(@RequestParam("isActive") boolean isActive, Model model) {
        model.addAttribute("undone", todoServiceInt.listUnDoneTodos(isActive));
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
        todoServiceInt.saveFromForm(title, urgent, done);
        return "redirect:/list";
    }

    @RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
    public String deleteTodo(@PathVariable("id") Long id) {
        todoServiceInt.delete(id);
        return "redirect:/list";
    }

    @GetMapping("{id}/edit")
    public String editTodo(@PathVariable("id") Long id, Model model) {
        model.addAttribute("todo", todoServiceInt.getTodoById(id));
        return "edit";
    }

    @PostMapping("edited")
    public String editTodo(@ModelAttribute(value = "id") Long id,
                           @ModelAttribute(value = "title") String title,
                           @RequestParam(value = "urgent", required = false, defaultValue = "false") Boolean urgent,
                           @RequestParam(value = "done", required = false, defaultValue = "false") Boolean done) {
        todoServiceInt.saveById(id, title, urgent, done);
        return "redirect:/list";
    }
}
