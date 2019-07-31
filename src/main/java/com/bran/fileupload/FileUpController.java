package com.bran.fileupload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * 文件上传的必要前提
 * 1.表单form的enctype取值必须为mutipart/form-data
 * 2.method属性的取值必须为POST
 * 3.提供一个文件选择域
 */
@Controller
@RequestMapping("/file")
public class FileUpController {

    /**
     *
     * 使用传统文件上传方式
     * @param request
     * @return
     */
    @RequestMapping("/fileupload1")
    public String fileupload1(HttpServletRequest request){
        System.out.println("传统的文件上传方式");

        //使用fileupload组件来完成文件上传
        //上传的位置
        String path = "E:\\IdeaProjects\\springmvc_test\\src\\main\\webapp\\uploads";
        //判断该路径是否存在
        File file = new File(path);
        if(!file.exists()){
            //如果路径不存在，则创建该文件夹
            file.mkdirs();
        }
        //1.创建磁盘文件项工厂类 DiskFileItemFactory
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //2.创建核心解析request类 ServletFileUpload
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            //3.开始解析request对象，返回是List集合
            //4.List集合中保存（表单的内容，分部分）
            List<FileItem> fileItems = upload.parseRequest(request);
            //5.循环遍历集合，获取内容
            for(FileItem fileItem :fileItems){
                //进行判断，判断当前的fileItem是否是上传文件项
                if(fileItem.isFormField()){
                    //说明是普通表单项
                    continue;
                }else{
                    //说明是文件上传项
                    //获取上传文件的名称
                    String fileName = fileItem.getName();
                    //把文件名称设置成唯一值，UUID
                    String uuid = UUID.randomUUID().toString().replace("-", "");
                    fileName = uuid+"_"+fileName;
                    //完成文件上传
                    fileItem.write(new File(path,fileName));
                    //删除临时文件
                    fileItem.delete();

                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * 使用SpringMVC的文件上传方式（需要配置文件解析器对象multipartResolver）
     * 接收文件信息封装到MultipartFile类型的方法参数中，
     * 并且方法参数名称必须和前端的表单文件选择框的名称一样
     * 前端文件选项框<input type="file" name="upload"/>名称为upload
     * 所以fileupload2(MultipartFile upload)方法参数名称也必须为upload，
     * 而不能用fileupload2(MultipartFile multipartFile)
     * @return
     */
    @RequestMapping("/fileupload2")
    public String fileupload2(MultipartFile upload){
        System.out.println("SpringMVC的文件上传方式");
        //上传的位置
        String path = "E:\\IdeaProjects\\springmvc_test\\src\\main\\webapp\\uploads";
        //判断该路径是否存在
        File file = new File(path);
        if(!file.exists()){
            //如果路径不存在，则创建该文件夹
            file.mkdirs();
        }
        //获取上传文件的名称
        String fileName = upload.getOriginalFilename();
        //把文件名称设置成唯一值，UUID
        String uuid = UUID.randomUUID().toString().replace("-", "");
        fileName = uuid+"_"+fileName;
        //完成文件上传
        try {
            upload.transferTo(new File(path,fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
