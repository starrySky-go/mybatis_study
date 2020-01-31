package com.itheima.domain;

import org.apache.ibatis.annotations.MapKey;
import returnValue.ReturnValueTest;

public class Student {
    private Integer id;
    private String lastName;
    private String gender;
    private Integer year;
    public  Student(){

    }
    public Student(Integer id, String name, String gender, Integer year) {
        this.id = id;
        this.lastName = name;
        this.gender = gender;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                '}';
    }
}
