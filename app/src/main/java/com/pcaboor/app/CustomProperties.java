package com.pcaboor.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.pcaboor.webapp")

public class CustomProperties {

    private String apiUrl;

}