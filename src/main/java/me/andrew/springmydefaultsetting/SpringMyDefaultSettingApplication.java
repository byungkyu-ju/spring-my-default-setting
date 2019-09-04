package me.andrew.springmydefaultsetting;

import java.lang.invoke.MethodHandles;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class SpringMyDefaultSettingApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringMyDefaultSettingApplication.class);

        springApplication.run(args);
    }

}
