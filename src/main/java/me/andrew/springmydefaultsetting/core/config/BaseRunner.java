package me.andrew.springmydefaultsetting.core.config;

import me.andrew.springmydefaultsetting.common.controller.LoginController;
import me.andrew.springmydefaultsetting.common.domain.UserDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BaseRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(BaseRunner.class);

    @Autowired
    private String baseConfiguration;

    @Autowired
    private LoginController loginController;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============");
        System.out.println(baseConfiguration);
        System.out.println("==============");
        System.out.println("==============");

    }
}
