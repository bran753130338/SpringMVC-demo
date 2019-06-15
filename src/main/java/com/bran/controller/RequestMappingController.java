package com.bran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RequestMapping注解
 * value    属性和path属性作用是一样的，而且只有这一个属性且只有一个值的时候可以省略
 * method   用于指定方法的具体的请求方式，请求方式不同则不执行方法
 * headers  用于指定限制请求消息头的条件
 * params   指定限制请求参数的条件
 *      |-params = {"username"} 要求必须传入一个username的参数
 *      |-params = {"username=kris"} 要求必须传入一个username的参数,且username的值为kris
 *      |-params = {"money!100"}    要求请求的money参数不能为100
 *    以上四个属性只要出现2个或以上时，它们的关系是与的关系
 * @return
 */
@Controller
@RequestMapping(path = "/test")
public class RequestMappingController {

    //@RequestMapping("/testRequestMapping")
    //@RequestMapping(path = "/testRequestMapping")
    @RequestMapping(value = "/testRequestMapping",method = {RequestMethod.GET})//要求必须用GET方式请求
    public String testRequestMapping(){
        System.out.println("测试RequestMapping");
        return "success";
    }


    @RequestMapping(value = "/testRequestMapping2",params = {"username"} )//要求必须传入一个username的参数
    public String testRequestMapping2(){
        System.out.println("测试RequestMapping2");
        return "success";
    }

}
