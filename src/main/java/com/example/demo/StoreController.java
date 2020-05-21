package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class StoreController {
    Owners owners = new Owners();
    Account loginPage = new Account();
    Account homePage = new Account();
    Account catPage = new Account();
    Account dogPage = new Account();
    Account profilePage = new Account();
    @GetMapping(value = {"/"})
    public String loadStore(Model model){
        model.addAttribute("account", new Account());
        if(!owners.getOwners().isEmpty()){
            model.addAttribute("owners", owners.getOwners());
            System.out.println("Inside if");
        } else {
            ArrayList<Account> empty = new ArrayList<Account>();
            empty.clear();
            model.addAttribute("owners", empty);
            System.out.println("Inside else");
        }

        return "login";
    }
    @PostMapping("/Account")
    public String loadStore(@Valid Account account, Model model){

        model.addAttribute("account", account);
        homePage = account;
        owners.setOwner(account);
        return "redirect:/HomePage";
    }


    @RequestMapping("/HomePage")
    public String homePage(@Valid Account account, Model model){
        model.addAttribute("account", homePage);
        return "home";
    }
    @RequestMapping("/LoginPage")
    public String loginPage(@Valid Account account, Model model){
        model.addAttribute("account", loginPage);
        return "login";
    }
    @RequestMapping("/DogPage")
    public String dogPage(@Valid Account account, Model model){
        model.addAttribute("account", dogPage);
        return "dog";
    }
    @RequestMapping("/CatPage")
    public String catPage(@Valid Account account, Model model){
        model.addAttribute("account", catPage);
        return "cat";
    }
    @RequestMapping("/ProfilePage")
    public String profilePage(@Valid Account account, Model model){
        model.addAttribute("account", profilePage);
        return "profile";
    }



}
