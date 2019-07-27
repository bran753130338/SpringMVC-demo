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
@RequestMapping("/json")
public class ResponseJsonController {

    /**
     * 异步请求响应,传入json格式数据，后台解析json格式数据转换成对象，需要加入jackson包
     *
     * @ResponseBody注解把返回的对象转换成指定格式的数据（json、xml）响应给客户端
     */

    @ResponseBody
    @RequestMapping("/testAjax")
    public User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了");
        //客户端发送ajax请求，传的是json字符串，后端把json字符串封装到user对象
        System.out.println(user);
        //做响应，模拟数据库操作
        user.setAge(12);
        user.setUname("管理员");
        return user;
    }
}
