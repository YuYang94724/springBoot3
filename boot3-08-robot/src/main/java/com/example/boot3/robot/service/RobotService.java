package com.example.boot3.robot.service;

import com.example.boot3.robot.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

    @Autowired
    RobotProperties robotProperties;

    public String sayHello(){
        return "Hello, my name is " + robotProperties.getName() + " and I am " + robotProperties.getAge() + " years old.";
    }
}
