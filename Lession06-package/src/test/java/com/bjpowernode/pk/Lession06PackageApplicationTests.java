package com.bjpowernode.pk;

import com.bjpowernode.pk.pk8.CollectionConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lession06PackageApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private SomeService someService;

    @Autowired
    private ReadConfig readConfig;

    @Autowired
    private MultiConfigService service;

    @Autowired
    private MultiEncService multiEncService;

    @Autowired
    private AppBean appBean;

    @Test
    void printValue() {
        someService.printValue();
    }

    @Test
    void test01() {
        readConfig.print();
    }

    @Test
    void test02() {

        service.print();
    }

    @Test
    void test04() {
        multiEncService.print();
    }

    @Test
    void test05() {
        System.out.println(appBean.getName());
        System.out.println(appBean.getOwner());
        System.out.println(appBean.getPort());
    }
    @Autowired
    private NestAppBean nestAppBean;

    @Test
    void test06() {
        System.out.println(nestAppBean.toString());
    }
    @Autowired
    private Security security;

    @Test
    void test07() {
        System.out.println(security);
    }

    @Autowired
    private CollectionConfig collectionConfig;

    @Test
    void test08() {
        System.out.println(collectionConfig);
    }
    @Autowired
    private Group group;

    @Test
    void test09() {
        System.out.println(group);
    }
}
