package com.bjpowernode.pk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Author:    Dane
 * CreateTime:2024/10/30-下午2:52
 * Since  :   1.0
 * Version:   1.0
 */
@Service
public class MultiEncService {

    @Value("${myapp.memo}")
    private String memo;

    public void print(){
        System.out.println("memo="+memo);
    }

}
