package com.hsbc.executing.demo.entity;

/**
 * @version :
 * @Author : landy
 * @Project :
 * @Description :
 * @Data : Create in 16:04 2018/7/31
 */
public class List {

    private String name;
    private Integer Type;
    private java.util.List<Food> foodList;

    public List() {

    }

    public List(String name, Integer type, java.util.List<Food> foodList) {
        this.name = name;
        Type = type;
        this.foodList = foodList;
    }

    public String getName() {
        return name;
    }

    public Integer getType() {
        return Type;
    }

    public java.util.List<Food> getFoodList() {
        return foodList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        Type = type;
    }

    public void setFoodList(java.util.List<Food> foodList) {
        this.foodList = foodList;
    }
}
