package com.greenfoxacademy.dependencies.controller;

import com.greenfoxacademy.dependencies.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GfaController {

    private StudentService studentService;

    @Autowired
    public GfaController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("gfa")
    public String gfaLinks() {
        return "gfa";
    }

    @GetMapping("gfa/list")
    public String studentList(Model model) {
        model.addAttribute("studentlist", studentService.findAll());
        return "list";
    }

}
