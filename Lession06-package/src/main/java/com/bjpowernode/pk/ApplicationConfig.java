package com.bjpowernode.pk;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/30-下午3:57
 * Since  :   1.0
 * Version:   1.0
 */
@Configuration
public class ApplicationConfig {

    @ConfigurationProperties(prefix = "security")
    @Bean
    public Security createSecurity(){
   return new Security();
    }

}
