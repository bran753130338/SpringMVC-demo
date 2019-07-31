package com.bran.domain;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
//要解析成Xml必须加上此注解
@XmlRootElement
public class User implements Serializable {


    private String uname;


    private Integer age;
}
