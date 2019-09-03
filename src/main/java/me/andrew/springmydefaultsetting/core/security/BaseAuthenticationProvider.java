package me.andrew.springmydefaultsetting.core.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class BaseAuthenticationProvider implements AuthenticationProvider {


    @Override
    public Authentication authenticate(Authentication authentication){
        String id = authentication.getName();
        //UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
          //      (UsernamePasswordAuthenticationToken) authentication;

        //usernamePasswordAuthenticationToken.
        //return new UsernamePasswordAuthenticationToken(UserDomain,null );
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
