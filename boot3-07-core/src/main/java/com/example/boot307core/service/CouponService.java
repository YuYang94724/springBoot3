package com.example.boot307core.service;

import com.example.boot307core.entity.UserEntity;
import com.example.boot307core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

    @EventListener
    public void listen(LoginSuccessEvent event){
        System.out.println("CouponService 收到事件 ======");
        addAccCoupon((UserEntity) event.getSource());
    }
    public void addAccCoupon(UserEntity userEntity){
        System.out.println(userEntity.getUsername() + " 得到優惠券 ~!!");
    }
}
