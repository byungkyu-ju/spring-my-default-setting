package me.andrew.springmydefaultsetting.common.controller;

import me.andrew.springmydefaultsetting.common.domain.UserDomain;
import me.andrew.springmydefaultsetting.common.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    LoginService loginService;

    @PostMapping("/login")
    public String login (@RequestBody UserDomain user){
        loginService.login(user);
        return null;
    }


}
