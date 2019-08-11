package me.andrew.springmydefaultsetting.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DefaultRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(DefaultRunner.class);

    @Autowired
    private String baseConfiguration;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============");
        System.out.println(baseConfiguration);
        System.out.println("==============");
        System.out.println("==============");

    }
}
