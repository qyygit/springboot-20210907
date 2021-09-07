package com.qyy.boot.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 */
@AllArgsConstructor   //有参构造函数
@NoArgsConstructor   //无参构造函数
@Data   //GET set  方法
@ToString  // ToString 方法


//@Component    //只有在容器中的组件,才会拥有SpringBoot提供的功能, 所以需要@Component 注解注入到容器中
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;
    private Integer price;


}
