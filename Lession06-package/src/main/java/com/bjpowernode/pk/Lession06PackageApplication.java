package com.bjpowernode.pk;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
//@EnableConfigurationProperties({NestAppBean.class})
@ConfigurationPropertiesScan(basePackages = {"com.bjpowernode.pk"})
public class Lession06PackageApplication {

    @Bean
    public Date myDate(){
        return new Date();
    }

    public static void main(String[] args) {
        SpringApplication.run(Lession06PackageApplication.class, args);
    }

}
