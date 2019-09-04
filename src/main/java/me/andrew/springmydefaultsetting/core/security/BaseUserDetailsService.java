package me.andrew.springmydefaultsetting.core.security;

import me.andrew.springmydefaultsetting.common.domain.User;
import me.andrew.springmydefaultsetting.common.repository.mybatis.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseUserDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(BaseUserDetailsService.class);
    @Autowired
    UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = new User();
        List<User> userList = userDAO.findUserByEmailList(email);
        if(userList == null) {
            throw new UsernameNotFoundException(email);
        }
        logger.info("@@@@@@@@@@@@@@@@@@@@@@ : " + userList.size());
        if(userList.size() == 1){
            user = userList.get(0);
        }
        return user;
    }
}
