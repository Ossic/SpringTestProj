package com.ossic.db.po;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class Person {

    private String name;
    /**
     * 添加 @JsonSerialize 注解
     * 用于将 long 转化为 String 类型到前端
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private long id;
    private int age;
    private boolean isMale;

    public Person() {
    }

    public Person(String name, long id, int age, boolean isMale) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
