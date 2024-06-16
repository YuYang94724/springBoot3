package com.atguigu.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {
    private String name;
    private Integer age;
    //預設格式是
    //1. @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    //2. @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm")
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime birthday;
    private boolean like;
    private Child child;
    private List<Dog> dogs;
    private Map<String, Cat> cats;
}
