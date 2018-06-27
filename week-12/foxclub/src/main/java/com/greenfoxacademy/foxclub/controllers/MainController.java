package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import com.greenfoxacademy.foxclub.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final FoxService foxService;
    private final LoginService loginService;

    @Autowired
    public MainController(FoxService foxService, LoginService loginService) {
        this.foxService = foxService;
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String mainPage(@RequestParam(value = "name", required = false, defaultValue = "Mr. Fox")
                           String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("numberoftricks", foxService.numberOfTricks());
        model.addAttribute("foxname", foxService.getFoxName());
        model.addAttribute("food", foxService.getFoxFood());
        model.addAttribute("drink", foxService.getFoxDrink());
        model.addAttribute("tricks", foxService.getFoxTricks());
        return "index";
    }

    @GetMapping("login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("loginbyname")
    public String login(@RequestParam("name") String name) {
        if (loginService.checkLoginName(name)) {
            foxService.setFoxName(name);
            return "redirect:/?name=" + name;
        }
        return "redirect:/login";
    }

    @GetMapping("addnewfox")
    public String newFox() {
        return "addnewfox";
    }

    @PostMapping("createdfox")
    public String createdFox(@ModelAttribute(value = "name") String name) {
        loginService.addLoginName(name);
        return "redirect:/login";
    }
}
