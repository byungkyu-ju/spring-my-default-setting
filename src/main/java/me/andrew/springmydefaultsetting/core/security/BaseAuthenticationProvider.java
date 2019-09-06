package me.andrew.springmydefaultsetting.core.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class BaseAuthenticationProvider implements AuthenticationProvider {

    private Logger logger = LoggerFactory.getLogger(BaseAuthenticationProvider.class);

    @Autowired
    BaseUserDetailsService baseUserDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication){
        UserDetails user = baseUserDetailsService.loadUserByUsername(authentication.getName());
        if(user.getUsername() == null){
            throw new UsernameNotFoundException("username is not founded.");
        }
        if(user.getPassword().equals(authentication.getCredentials()) == false){
            throw new BadCredentialsException("password was not matched");
        }

        return new UsernamePasswordAuthenticationToken(user,authentication.getCredentials());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
