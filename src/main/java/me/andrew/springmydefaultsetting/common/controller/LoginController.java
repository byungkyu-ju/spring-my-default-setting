package me.andrew.springmydefaultsetting.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("message","helloWorld");
        return "index";
    }
}
