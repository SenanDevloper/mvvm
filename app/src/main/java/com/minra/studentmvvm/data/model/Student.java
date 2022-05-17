package com.minra.studentmvvm.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
 //ss
@Entity(tableName = "student")
public class Student {

    public Student() {
    }

    @PrimaryKey
    @SerializedName("id")
    @ColumnInfo(name = "id")
    int id;

    @Expose
    @SerializedName("sname")
    @ColumnInfo(name = "sname")
    String sname;

    @Expose
    @SerializedName("age")
    @ColumnInfo(name = "age")
    int age;

    @SerializedName("imgpath")
    @ColumnInfo(name = "imgpath")
    String imgpath;



    public Student(int id, String sname, int age,String _imgpath) {
        this.id = id;
        this.sname = sname;
        this.age = age;
        this.imgpath=_imgpath;
    }

    public Student(int id, String sname, int age) {
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

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
