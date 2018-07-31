package com.hsbc.executing.demo.controller;

import com.hsbc.executing.demo.entity.Food;
import com.hsbc.executing.demo.entity.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @version :
 * @Author : landy
 * @Project :
 * @Description :
 * @Data : Create in 16:00 2018/7/31
 */
@RestController
public class ShopController {
    @GetMapping(path = "/sell/buyer/product/list")
    public List sell(){
        /**
        *@Author : landy
        *@description : 一个GET请求
        *@Date:16:39 2018/7/31
        *@User:lan
        *@Param: * @param
        */
        java.util.List<Food> foodlist = new ArrayList<>();
        foodlist.add(new Food(1,"皮蛋粥",1.2,"好吃的皮蛋粥","www.baidu.com"));
        foodlist.add(new Food(2,"瘦肉粥",1.3,"好吃的瘦肉粥","www.google.com"));
        List list = new List("热榜",1,foodlist);
        return list;
    }
}
