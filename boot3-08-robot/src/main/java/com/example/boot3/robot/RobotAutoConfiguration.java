package com.example.boot3.robot;

import com.example.boot3.robot.controller.RobotController;
import com.example.boot3.robot.properties.RobotProperties;
import com.example.boot3.robot.service.RobotService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//當robot.enabled為true時,自動配置生效
@ConditionalOnProperty(havingValue = "true", name = "robot.enabled")
@Configuration
@Import({RobotService.class, RobotProperties.class, RobotController.class})
public class RobotAutoConfiguration {
}
