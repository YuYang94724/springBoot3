package com.example.boot307core.service;

import com.example.boot307core.entity.UserEntity;
import com.example.boot307core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class AccService implements ApplicationListener<LoginSuccessEvent> {


    public void addAccScore(UserEntity userEntity){
        System.out.println(userEntity.getUsername() + " 加了積分 ~!!");
    }
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("AccService 收到事件 =====");
        addAccScore((UserEntity) event.getSource());
    }
}
