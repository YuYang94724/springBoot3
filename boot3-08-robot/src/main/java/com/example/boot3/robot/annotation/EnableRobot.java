package com.example.boot3.robot.annotation;


import com.example.boot3.robot.RobotAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RobotAutoConfiguration.class)
public @interface EnableRobot {
}
