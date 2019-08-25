package me.andrew.springmydefaultsetting.core.config.prod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class ProdBaseConfiguration {

    @Bean
    public String baseConfiguration(){
        String message = "this is prod";
        return message;
    }
}
