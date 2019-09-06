package me.andrew.springmydefaultsetting.core.security;

import me.andrew.springmydefaultsetting.common.domain.Account;
import me.andrew.springmydefaultsetting.common.repository.AccountRepository;
import me.andrew.springmydefaultsetting.common.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BaseUserDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(BaseUserDetailsService.class);

    @Autowired
    AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Account account = accountService.findByEmail(email);

        if(account == null) throw new UsernameNotFoundException("cannot find User by email");

        return new User(account.getEmail(),account.getPassword(), AuthorityUtils.createAuthorityList("USER"));
    }
}
