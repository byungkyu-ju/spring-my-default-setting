package me.andrew.springmydefaultsetting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("me.andrew.springmydefaultsetting")
public class SpringMyDefaultSettingApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringMyDefaultSettingApplication.class);

        springApplication.run(args);
    }

}
