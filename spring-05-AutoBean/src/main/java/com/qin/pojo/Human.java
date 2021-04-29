package com.qin.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(Cat cat, Dog dog, String name) {
        this.cat = cat;
        this.dog = dog;
        this.name = name;
    }
}
