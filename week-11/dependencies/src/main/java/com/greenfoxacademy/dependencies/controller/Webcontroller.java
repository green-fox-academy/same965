package com.greenfoxacademy.dependencies.controller;

import com.greenfoxacademy.dependencies.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Webcontroller {
    UtilityService utilityService;

    @Autowired
    public Webcontroller(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("useful")
    public String usefulLinks() {
        return "useful";
    }

    @GetMapping("useful/colored")
    public String coloredBackground(Model model) {
        model.addAttribute("background", utilityService.randomColor());
        return "colored";
    }
}
