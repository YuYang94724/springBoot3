package com.example.boot3.robot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties(prefix = "robot")//此属性类和配置文件指定前缀绑定
@Component//或者在標記@Configruration的地方再加上@EnableConfigurationProperties({RobotProperties.class})
@Data
public class RobotProperties {
    private String name;
    private String age;
    private String email;
    private boolean enabled;
}
