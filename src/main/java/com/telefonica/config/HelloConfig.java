package com.telefonica.config;

import com.telefonica.services.HelloWorldFactory;
import com.telefonica.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 10/27/15.
 */
@Configuration
public class HelloConfig {

    @Value("${spring.profiles.active}")
    private String language;

    @Bean
    public HelloWorldService helloWorldFactory() {
        return new HelloWorldFactory().createHelloWorldService(language);
    }
}
