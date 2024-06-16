package com.atguigu;

import com.atguigu.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        var ioc = SpringApplication.run(MyApplication.class, args);
        var person = ioc.getBean(Person.class);
        System.out.println("person: " + person);

    }

}
