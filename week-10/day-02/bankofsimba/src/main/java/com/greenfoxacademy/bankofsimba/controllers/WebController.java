package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankService;
import com.greenfoxacademy.bankofsimba.services.BankServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class WebController {

    private BankService bankService;

    public WebController(BankService bankService) {
        this.bankService = bankService;
        bankService.createNewAccount();
    }

    @GetMapping("show")
    public String showAccount(Model model) {
        model.addAttribute("accounts", bankService.getAccounts());
        return "accounts";
    }

    @GetMapping("htmlception")
    public String htmlCeption(Model model) {
        String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text", text);
        return "htmlception";
    }

    @RequestMapping("newaccount")
    public String newAccount() {
        return "newaccount";
    }

    @PostMapping("addnewaccount")
    public String addNewAccount(@ModelAttribute(value = "name") String name,
                                @ModelAttribute(value = "balance") Double balance,
                                @ModelAttribute(value = "animalType") String animalType,
                                @ModelAttribute(value = "isGood") Boolean isGood) {
        bankService.add(new BankAccount(name, balance, animalType, isGood, false));
        return "redirect:/show";
    }
}
