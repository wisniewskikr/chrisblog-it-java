package com.example.configs;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {
	
	@Bean
    public KeycloakConfigResolver getKeycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }

}
