package com.qyy.boot;

import com.qyy.boot.bean.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description TODO
 * @Date 2021/9/7 21:25
 * @Created by qyy
 */
@SpringBootApplication
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        log.info("主程序已起动 ");
//
//        //获取容器中注册的组件信息
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
//
//        //从容器中获取组件
//        Pet tom = run.getBean("TOM", Pet.class);
//        Pet tom2 = run.getBean("TOM", Pet.class);
//        System.out.println(tom==tom2);
//        log.info("我是从容器中获取的" + tom);
    }
}
