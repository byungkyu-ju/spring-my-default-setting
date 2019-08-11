package me.andrew.springmydefaultsetting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMyDefaultSettingApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringMyDefaultSettingApplication.class);

        springApplication.run(args);
    }

}
