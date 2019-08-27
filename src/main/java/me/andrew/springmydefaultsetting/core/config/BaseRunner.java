package me.andrew.springmydefaultsetting.core.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BaseRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(BaseRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============");
        System.out.println("==============");
        System.out.println("==============");

    }
}
