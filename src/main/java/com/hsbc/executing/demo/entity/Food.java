package com.hsbc.executing.demo.entity;

/**
 * @version :
 * @Author : landy
 * @Project :
 * @Description :
 * @Data : Create in 16:04 2018/7/31
 */
public class Food {

    private Integer id;
    private String name;
    private double price;
    private String description;
    private String icon;

    public Food() {
    }

    public Food(final Integer id, final String name, final double price, final String description, final String icon) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
