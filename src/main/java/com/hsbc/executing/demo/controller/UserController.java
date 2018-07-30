package com.hsbc.executing.demo.controller;

import com.hsbc.executing.demo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @version :
 * @Author : landy
 * @Project :
 * @Description :测试类控制层
 * @Data : Create in 11:03 2018/7/30
 */
@RestController
public class UserController {
    /**
    *@Author : landy
    *@description : 测试返回user的json对象
    *@Date:11:12 2018/7/30
    *@User:lan
    *@Param: * @param null
    */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public List<User> findUser(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("lan",10));
        userList.add(new User("fly",20));
        return userList;

    }
    /**
    *@Author : landy
    *@description : 测试传入参数返回user的json对象
    *@Date:11:13 2018/7/30
    *@User:lan
    *@Param: * @param null
    */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public User login(String name,Integer age){
        User user = new User(name,age);
        return user;
    }

}
