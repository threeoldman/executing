package com.hsbc.executing.demo;

import com.hsbc.executing.demo.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



/**
 * @version :
 * @Author : landy
 * @Project :
 * @Description :测试类的测试类
 * @Data : Create in 11:48 2018/7/30
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
@AutoConfigureRestDocs
public class UserControllerTests {

    @Autowired
    private MockMvc mvc;
    /**
    *@Author : landy
    *@description : 测试路径为hello的方法
    *@Date:14:28 2018/7/30
    *@User:lan
    *@Param: * @param null
    */
    @Test
    public void test01() throws Exception{
        this.mvc.perform(get("/hello").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andDo(print());


    }
    /**
    *@Author : landy
    *@description : 测试login方法并传入具体参数
    *@Date:14:28 2018/7/30
    *@User:lan
    *@Param: * @param null
    */
    @Test
    public void test02() throws Exception{
        this.mvc.perform(get("/login?name=lan&age=10").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andDo(print());


    }
    /**
    *@Author : landy
    *@description : 
    *@Date:17:40 2018/7/30
    *@User:lan
    *@Param: * @param null
    */
    @Test
    public void test03() throws Exception{
        this.mvc.perform(post("/findpost").accept(MediaType.APPLICATION_JSON_UTF8))

                .andExpect(status().isOk())
                .andDo(print());


    }
}
