package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.services.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong counter = new AtomicLong(0);
    Hello hello = new Hello();


    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("counter", counter.incrementAndGet());
        return "greeting";
    }

    @RequestMapping("/web/hello")
    public String hello(Model model) {
        model.addAttribute("hello", hello.oneHello());
        model.addAttribute("color",
                "rgb(" + hello.randomColor() + ", " + hello.randomColor() + ", " + hello.randomColor() + ")");
        model.addAttribute("font", hello.randomFontSize() + "px");
        return "hello";
    }
}
