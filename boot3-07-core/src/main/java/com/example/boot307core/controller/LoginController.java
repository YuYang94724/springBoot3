package com.example.boot307core.controller;

import com.example.boot307core.entity.UserEntity;
import com.example.boot307core.event.AppEventPublusher;
import com.example.boot307core.event.LoginSuccessEvent;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginController {

    @Autowired
    AppEventPublusher appEventPublusher;

    public void login(UserEntity userEntity){
        System.out.println(userEntity);

        val loginSuccessEvent = new LoginSuccessEvent(userEntity);
        appEventPublusher.sendEvent(loginSuccessEvent);

    }
}
