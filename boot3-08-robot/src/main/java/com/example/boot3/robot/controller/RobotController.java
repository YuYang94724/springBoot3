package com.example.boot3.robot.controller;

import com.example.boot3.robot.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

    @Autowired
    RobotService robotService;


    @GetMapping("/robot/hello")
    public String sayHello(){
        return robotService.sayHello();
    }
}
