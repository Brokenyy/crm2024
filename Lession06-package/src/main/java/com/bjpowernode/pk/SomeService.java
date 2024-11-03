package com.bjpowernode.pk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/30-下午12:56
 * Since  :   1.0
 * Version:   1.0
 */
@Service
public class SomeService {
    @Value("${app.name:yaokun}")
    private String name;
    @Value("${app.owner:yaokun}")
    private String owner;
    @Value("${app.port:yaokun}")
    private String port;
    @Value("${app.test:yaokun}")
    private String test;

    public void printValue() {
        System.out.println(name);
        System.out.println(owner);
        System.out.println(port);
        System.out.println(test);
    }
}
