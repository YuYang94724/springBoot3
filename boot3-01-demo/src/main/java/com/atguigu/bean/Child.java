package com.atguigu.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Data
//下列要開啟在配置文件內才會有提示
//@Component
//@ConfigurationProperties(prefix = "person.child")
public class Child {
    private String name;
    private Integer age;
    private LocalDate birthday;
    private List<String> text;
}
