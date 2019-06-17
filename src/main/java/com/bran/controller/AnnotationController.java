package com.bran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 常用注解练习
 */
@Controller
@RequestMapping("/anno")
public class AnnotationController {
    /**
     * 注解：@RequestParam
     * 作用：把请求中指定名称的参数给控制器中的形式参数赋值
     * 属性：value：请求参数的名称
     * required：请求参数中是否提供此参数。默认值：true。表示必须提供，不提供会出错
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println(username);
        return "success";
    }

    /**
     * 注解：@RequestBody
     * 作用：用于获取请求体的内容。直接使用得到是key=value&key=value...结构的数据。
     *      GET请求方式不适用(没有请求体)
     * 属性：required：是否必须有请求体。默认值为true。
     *      当取值为true时，GET请求方式会报错。
     *      当取值为false时，GET请求得到的是null。
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    /**
     * 注解：@PathVaribale
     * 作用：用于绑定URL中的占位符，例如：请求URL中的/delete/{id}，这个{id}就是URL占位符。
     *      URL支持占位符是Spring3.0之后加入的。是SpringMVC支持REST风格URL的一个重要标志。
     * 属性：value：用于指定URL中占位符名称
     *      required：是否必须提供占位符。
     */
    @RequestMapping("/testPathVaribale")
    public String testPathVaribale(){
        return "success";
    }

}
