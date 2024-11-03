package com.bjpowernode.pk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/30-下午1:21
 * Since  :   1.0
 * Version:   1.0
 */
@Service
public class ReadConfig {
    @Autowired
    private Environment environment;

    public void print(){
        if (environment.containsProperty("app.name")) {
            Integer property = environment.getProperty("app.port", Integer.class, 1234);
            System.out.println(property);

        }
    }
}
