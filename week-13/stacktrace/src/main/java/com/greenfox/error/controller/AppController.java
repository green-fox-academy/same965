package com.greenfox.error.controller;

import com.greenfox.error.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

    @Autowired
    UserService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute(value = "firstname") String firstname,
                         @ModelAttribute(value = "lastname") String lastname) {
        service.save(firstname, lastname);
        return "redirect:/";
    }
}