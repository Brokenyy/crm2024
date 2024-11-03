package com.bjpowernode.pk;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/30-下午3:06
 * Since  :   1.0
 * Version:   1.0
 */
//@Component
@Configuration
@Data
@ConfigurationProperties(prefix = "app")
public class AppBean {

    private String name;
    private String owner;
    private String port;
}
