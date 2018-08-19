package com.springboot.apo;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao{

    public String add(String username, String password) {

        System.out.println("username" + username + "password" + password);
        return null;
    }

}
