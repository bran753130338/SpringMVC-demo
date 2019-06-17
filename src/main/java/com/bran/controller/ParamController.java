package com.bran.controller;

import com.bran.domain.Account;
import com.bran.domain.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMVC的参数绑定过程是把表单提交的请求参数，作为控制器中方法的参数进行绑定的
 * 要求：提交表单的name和方法参数的名称是一致的
 * 支持的数据类型：
 *      |-基本数据类型和字符串类型
 *      |-实体类型(JavaBean)
 *      |-集合数据类型(List、Map集合等)
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    //接收基本数据类型
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("获取参数");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        return "success";
    }

    //请求参数绑定把数据封装到JavaBean的类中
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    //请求参数绑定把数据封装到JavaBean的类中,包含集合数据
    @RequestMapping("/saveManager")
    public String saveManager(Manager manager){
        System.out.println(manager);
        return "success";
    }
}
