package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("nutritionstore")
    public String nutritionStore(@RequestParam(value = "name", required = false, defaultValue = "Mr. Fox")
                                             String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("foxname", foxService.getFoxName());
        return "nutritionstore";
    }

    @PostMapping("nutrition")
    public String nutrition(@ModelAttribute("food") String food,
                            @ModelAttribute("drink") String drink,
                            @ModelAttribute("name") String name) {
        foxService.setFoxFood(food);
        foxService.setFoxDrink(drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping("trickcenter")
    public String trickCenter(@RequestParam(value = "name", required = false, defaultValue = "Mr. Fox")
                                         String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("foxname", foxService.getFoxName());
        return "trickcenter";
    }

    @PostMapping("trick")
    public String trick(@ModelAttribute("tricks") String trick, @ModelAttribute("name") String name) {
        foxService.addFoxTrick(trick);
        return "redirect:/?name=" + name;
    }


}
