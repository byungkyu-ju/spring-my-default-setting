package me.andrew.springmydefaultsetting.core.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class BaseUserDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(BaseUserDetailsService.class);

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return null;
    }
}
