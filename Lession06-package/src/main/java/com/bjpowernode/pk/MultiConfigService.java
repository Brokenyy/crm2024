package com.bjpowernode.pk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/30-下午2:39
 * Since  :   1.0
 * Version:   1.0
 */
@Service
public class MultiConfigService {

    @Value("${spring.redis.host}")
    private  String redisHostName;

    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    public void print(){
        System.out.println("redisHostName="+redisHostName+" "+"jdbcUrl"+jdbcUrl);
    }
}
