package com.bran.response;

import com.bran.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 响应JSON数据
 */
@Controller
@RequestMapping("/ajax")
public class ResponseAjaxController {

    /**
     * 异步请求响应,传入json格式数据，后台解析json格式数据转换成对象，需要加入jackson包
     *
     * @ResponseBody注解把返回的对象转换成指定格式的数据（json、xml）响应给客户端
     */

    @ResponseBody
    @RequestMapping("/testJson")
    public User testJson(@RequestBody User user){
        System.out.println("testJson方法执行了");
        //客户端发送ajax请求，传的是json字符串，后端把json字符串封装到user对象
        System.out.println(user);
        //做响应，模拟数据库操作
        user.setAge(12);
        user.setUname("管理员");
        return user;
    }

    /**
     * 解析XML格式数据，返回XMl响应给客户端
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping("/testXml")
    public User testXml(@RequestBody User user){
        System.out.println("testXml方法执行了");
        System.out.println(user);
        user.setUname("哈哈");
        user.setAge(66);
        return user;
    }
}
