package com.itheima.domain;

public class StudentPlus {
    private Integer id;
    private String lastName;
    private String gender;
    private int year;
    private Department dept;
    public StudentPlus(){

    }
    public StudentPlus(Integer id, String name, String gender, int year,Department department) {
        this.id = id;
        this.lastName = name;
        this.gender = gender;
        this.year = year;
        this.dept = department;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "StudentPlus{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                ", dept=" + dept +
                '}';
    }
}
