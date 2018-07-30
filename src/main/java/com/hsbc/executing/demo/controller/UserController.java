package com.hsbc.executing.demo.controller;

import com.hsbc.executing.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    *@description : 测试GET请求返回user的json对象
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
    *@description : 测试GET请求传入参数返回user的json对象
    *@Date:11:13 2018/7/30
    *@User:lan
    *@Param: * @param null
    */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public User login(String name,Integer age){
        User user = new User(name,age);
        return user;
    }
    /**
    *@Author : landy
    *@description : 测试POST请求并传入一个user对象
    *@Date:17:07 2018/7/30
    *@User:lan
    *@Param: * @param null
    */
   @PostMapping(path = "/findpath")
    public String postFindUser(@RequestBody User user){
        return user.toString();
    }
    /**
     *@Author : landy
     *@description : 测试PUT请求并传入一个user对象
     *@Date:17:07 2018/7/30
     *@User:lan
     *@Param: * @param null
     */
    @PutMapping(path = "/findput")
    public User putFindUser(@RequestBody User user){
        return user;
    }
    /**
     *@Author : landy
     *@description : 测试DELETE请求并传入一个user对象
     *@Date:17:07 2018/7/30
     *@User:lan
     *@Param: * @param null
     */
    @DeleteMapping(path = "/finddelete")
    public User deleteFindUser(@RequestBody User user){
        return user;
    }
}
