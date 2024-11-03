package com.bjpowernode.pk.pk8;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/30-下午4:05
 * Since  :   1.0
 * Version:   1.0
 */
@ConfigurationProperties
@Data
public class CollectionConfig {
    private List<MyServer> servers;
    private Map<String,User>users;
    private String[] names;


}
