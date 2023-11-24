package com.example.boot307core;

import com.example.boot307core.controller.LoginController;
import com.example.boot307core.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Boot307CoreApplication {

    @Autowired
    LoginController loginController;

    public static void main(String[] args) {
        SpringApplication.run(Boot307CoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("hello command!!");
            loginController.login(new UserEntity("nick", "1234"));
        };
    }
}
