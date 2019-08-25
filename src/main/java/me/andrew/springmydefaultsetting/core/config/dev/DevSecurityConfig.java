package me.andrew.springmydefaultsetting.core.config.dev;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Profile("dev")
@Configuration
@EnableWebSecurity
public class DevSecurityConfig {

}
