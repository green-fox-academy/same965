package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong counter = new AtomicLong(0);

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("counter", counter.incrementAndGet());
        return "greeting";
    }
}
