package me.andrew.springmydefaultsetting.common.service;

import me.andrew.springmydefaultsetting.common.domain.UserDomain;
import me.andrew.springmydefaultsetting.core.security.BaseUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    BaseUserDetailsService baseUserDetailsService;

    public void login(UserDomain user){
        baseUserDetailsService.loadUserByUsername(user.getEmail());
    }
}
