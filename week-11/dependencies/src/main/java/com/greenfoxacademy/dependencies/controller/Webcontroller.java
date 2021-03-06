package com.greenfoxacademy.dependencies.controller;

import com.greenfoxacademy.dependencies.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

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

    @RequestMapping("useful/email")
    public String email(@RequestParam("email") String email, Model model) {
        model.addAttribute("valideemail", utilityService.validateEmail(email));
        model.addAttribute("email", email);
        return "validateemail";
    }

    @RequestMapping("useful/encoder")
    public String encoder(@RequestParam("text") String text,
        @RequestParam("number") int number, Model model) {
        model.addAttribute("encode", utilityService.caesar(text, number));
        return "encoder";
    }

    @RequestMapping("useful/decoder")
    public String decoder(@RequestParam("text") String text,
                          @RequestParam("number") int number, Model model) {
        model.addAttribute("decode", utilityService.caesar(text, number * (-1)));
        return "decoder";
    }


}
