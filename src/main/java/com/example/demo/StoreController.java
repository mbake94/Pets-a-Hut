package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class StoreController {
    @GetMapping(value = {"/"})
    public String loadStore(Model model){
        model.addAttribute("account", new Account());

        return "login";
    }
    @PostMapping("/Account")
    public String loadStore(@Valid Account account, Model model){

        model.addAttribute("account", account);

        return "home";
    }

}
