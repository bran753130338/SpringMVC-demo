package com.bran.response;

import com.bran.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/response")
public class ResponseController {

    /**
     * 测试响应返回字符串类型
     *
     */
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了");
        //模拟从数据库查数据
        User user = new User();
        user.setUname("kris");
        user.setAge(25);
        //model对象
        model.addAttribute("user",user);
        return "respresult";
    }

    /**
     *测试响应返回值是void类型
     *
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid方法执行了");
        //模拟从数据库查数据
        User user = new User();
        user.setUname("KAKAXI");
        user.setAge(41);
        request.setAttribute("user",user);
        //model对象
        request.getRequestDispatcher("/respresult.jsp").forward(request,response);
    }

    /**
     * 测试响应返回值是ModelAndView对象
     * |——ModelAndView对象时Spring提供的一个对象，可以用来调整具体的JSP视图
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView方法执行了");
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //模拟从数据库查数据
        User user = new User();
        user.setUname("caixukun");
        user.setAge(28);
        //把user对象存到modelAndView对象中，也会把user对象存到request域中
        modelAndView.addObject("user",user);
        //设置要跳转到哪个页面
        modelAndView.setViewName("respresult");
        return modelAndView;
    }
}
