package me.andrew.springmydefaultsetting.config.stage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("stage")
@Configuration
public class StageBaseConfiguration {

    @Bean
    public String baseConfiguration(){
        String message = "this is stage";

        System.out.println("how to run");
        System.out.println("./gradlew build");
        System.out.println("java -jar build/libs/spring-my-default-setting-0.0.1.jar --spring.profiles.active=stage");


        return message;
    }
}
