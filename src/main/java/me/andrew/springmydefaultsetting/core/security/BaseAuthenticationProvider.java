package me.andrew.springmydefaultsetting.core.security;

import me.andrew.springmydefaultsetting.common.domain.UserDomain;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class BaseAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication){
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                (UsernamePasswordAuthenticationToken) authentication;
        //usernamePasswordAuthenticationToken.
        //return new UsernamePasswordAuthenticationToken(UserDomain,null );
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
