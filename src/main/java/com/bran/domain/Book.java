package com.bran.domain;

import lombok.Data;
import java.util.Date;

@Data
public class Book {

    private String name;

    private String author;

    private Date date;
}
