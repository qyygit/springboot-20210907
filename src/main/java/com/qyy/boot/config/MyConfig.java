package com.qyy.boot.config;

import com.qyy.boot.bean.Car;
import com.qyy.boot.bean.Pet;
import com.qyy.boot.bean.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Date 2021/9/7 21:57
 * @Created by qyy
 */
@Configuration   //告诉springBoot 容器,这是一个配置类 == 配置文件
@EnableConfigurationProperties(Car.class)  //开启Car配置绑定功能  2 ,把这个Car自动注册到容器中
public class MyConfig {

    @Bean  //给容器添加组件, 以方法名作为组件的id 返回类型就是组件的类型 , 返回值就是在容器中的实例
    public User user(){
        return  new User("秦洋洋",18);
    }

    @Bean("TOM")
    public Pet tomcat(){
        return new Pet("tomcat");
    }
}
