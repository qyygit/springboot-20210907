package com.qyy.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2021/9/9 22:23
 * @Created by qyy
 */
@RestController
public class ParameterController {

    /**
     * @param id
     * @param name
     * @param pv
     * @return java.util.Map<java.lang.String, java.lang.Object>
     * @author: Mrs Yang
     * @description: TODO  测试web 参数注解使用规则
     * @date: 2021/9/9 22:30
     */
    @GetMapping(value = "/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
//                                      从请求路径中获取参数信息
                                      @PathVariable("username") String name,
//                                        获取路径中所有参数信息
                                      @PathVariable Map<String, String> pv,
//                                     获取请求头信息
                                      @RequestHeader("host") String host,
//                                     获取所有请求头信息
                                      @RequestHeader Map<String, String> header) {


        Map<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        map.put("pv",pv);
        map.put("host",host);
        map.put("header",header);
        return map;

    }
}
