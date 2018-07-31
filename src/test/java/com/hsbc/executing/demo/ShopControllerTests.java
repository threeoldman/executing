package com.hsbc.executing.demo;


import com.hsbc.executing.demo.controller.ShopController;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @version :
 * @Author : landy
 * @Project :
 * @Description :ShopController测试类
 * @Data : Create in 16:21 2018/7/31
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ShopController.class)
@AutoConfigureRestDocs
public class ShopControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void test01() throws Exception {
        /**
        *@Author : landy
        *@description : 测试GET请求的sell链接
        *@Date:16:37 2018/7/31
        *@User:lan
        *@Param: * @param 
        */
        this.mvc.perform(get("/sell/buyer/product/list").contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
