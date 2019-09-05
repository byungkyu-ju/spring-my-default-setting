package me.andrew.springmydefaultsetting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringMyDefaultSettingApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringMyDefaultSettingApplication.class);

        springApplication.run(args);
    }

}
