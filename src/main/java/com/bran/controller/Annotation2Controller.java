package com.bran.controller;

import com.bran.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.Map;


/**
 * 常用注解练习2
 */
@Controller
@RequestMapping("/anno2")
public class Annotation2Controller {
    /**
     * 注解：@ModelAttribute
     * 作用：可以用于修饰方法和参数。
     *      出现在方法上，表示当前所在类的方法会在控制器的方法执行之前先执行，可以修饰没有返回值的方法，也可以修饰有具体返回值的方法
     *      出现在参数上，获取指定的数据给参数赋值
     * 属性：value：用于获取数据的key，key可以是POJO的属性名称，也可以是map结构的key
     * 运用场景：当表单提交数据不是完整的实体类数据时，保证没有提交数据字段使用数据库对象原来的数据
     */

//    /**
//     * 表单提交数据不是完整的实体数据时，有返回值的处理步骤
//     *
//     */
//    @RequestMapping("/testModelAttribute")
//    public String ModelAttribute(Book book){
//        System.out.println(book);
//        return "success";
//    }
//
//    /**
//     * 该方法会先执行，有返回值
//     */
//    @ModelAttribute
//    public Book showBook(String name,String author){
//        //模拟用户查询数据库
//        Book book = new Book();
//        book.setName(name);
//        book.setAuthor(author);
//        book.setDate(new Date());
//        System.out.println("showBook执行了");
//        return book;
//    }

    /**
     * 表单提交数据不是完整的实体数据时，无返回值的处理步骤
     */
    @RequestMapping("/testModelAttribute")
    public String ModelAttribute(@ModelAttribute(value = "book") Book book) {
        System.out.println(book);
        return "success";
    }

    /**
     * 该方法会先执行，无返回值
     */
    @ModelAttribute
    public void showBook(String name, String author, Map<String, Book> map) {
        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setDate(new Date());
        System.out.println("showBook执行了");
        map.put("book", book);
    }

}
