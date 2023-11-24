package com.example.boot307core.service;

import com.example.boot307core.entity.UserEntity;
import com.example.boot307core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SysService {

    @EventListener
    public void listen(LoginSuccessEvent event){
        System.out.println("SysService 收到事件 ======");
        recordAcc((UserEntity) event.getSource());
    }
    public void recordAcc(UserEntity userEntity){
        System.out.println(userEntity.getUsername() + " 紀錄Log ~!!");
    }
}
