package me.andrew.springmydefaultsetting.core.security;

import me.andrew.springmydefaultsetting.SpringMyDefaultSettingApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class BaseAuthenticationProvider implements AuthenticationProvider {

    private Logger logger = LoggerFactory.getLogger(BaseAuthenticationProvider.class);

    @Autowired
    BaseUserDetailsService baseUserDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication){

        String email = authentication.getName();
        String password = (String)authentication.getCredentials();

        UserDetails user = baseUserDetailsService.loadUserByUsername(email);
        //usernamePasswordAuthenticationToken.
        //return new UsernamePasswordAuthenticationToken(UserDomain,null );
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
