package me.andrew.springmydefaultsetting.config.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class DevBaseConfiguration {

    @Bean
    public String baseConfiguration(){
        String message = "this is dev";
        return message;
    }
}
