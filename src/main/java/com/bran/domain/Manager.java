package com.bran.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class Manager implements Serializable {

    private String name;

    private List<User> list;

    private Map<String,User> map;
}
