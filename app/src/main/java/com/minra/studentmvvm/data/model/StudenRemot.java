package com.minra.studentmvvm.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//students
public class StudenRemot
{
    private int id;
    private String sname;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
