package com.bjpowernode.pk;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/30-下午4:37
 * Since  :   1.0
 * Version:   1.0
 */

@Data
//@Configuration
@ConfigurationProperties(prefix = "group")
@PropertySource(value = "classpath:/group-info.properties")
public class Group {
    private String  name;
    private String leader;
    private Integer member;

}
