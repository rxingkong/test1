package com.test.ssm.test;

import com.test.ssm.service.DutiesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {
    @Resource
    private DutiesService dutiesService;
    @Test
    public void fffff(){
        System.out.println(dutiesService.getAll(2));
    }
}
