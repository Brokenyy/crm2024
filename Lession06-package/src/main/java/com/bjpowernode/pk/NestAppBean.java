package com.bjpowernode.pk;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/30-下午3:24
 * Since  :   1.0
 * Version:   1.0
 */
@Data
//@Configuration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = "myapp")
public class NestAppBean {
    private String name;
    private String owner;
    private Integer  port;
    private  Security security;
}
