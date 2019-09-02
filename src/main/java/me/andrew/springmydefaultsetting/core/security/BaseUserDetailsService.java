package me.andrew.springmydefaultsetting.core.security;

import me.andrew.springmydefaultsetting.common.domain.User;
import me.andrew.springmydefaultsetting.common.repository.mybatis.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BaseUserDetailsService implements UserDetailsService {
    @Autowired
    UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        List<User> userList = userDAO.findUserByEmail(email);
        User user = userList.get(0);
        return user;
    }
}
