package com.example.hw3_m3;

public class Car {
    private String name;
    private String logo;
    private String desc;


    public Car(String name, String logo, String desc) {
        this.name = name;
        this.logo = logo;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
