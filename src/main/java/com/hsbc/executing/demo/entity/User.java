package com.hsbc.executing.demo.entity;

/**
 * @version :
 * @Author : landy
 * @Project :
 * @Description :测试实体类
 * @Data : Create in 11:02 2018/7/30
 */
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}