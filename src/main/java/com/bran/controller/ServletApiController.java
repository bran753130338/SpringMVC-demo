package com.bran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/servlet")
public class ServletApiController {

    //原生的ServletAPI
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了testServlet");
        //request对象
        System.out.println(request.getContextPath());
        //session对象
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        //ServletContext对象
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext.getServletContextName());
        //response对象
        System.out.println(response.getStatus());

        return "success";
    }
}
