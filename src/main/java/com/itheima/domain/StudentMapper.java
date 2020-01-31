package com.itheima.domain;

public interface StudentMapper {

     Student getStudentById(int id);

     boolean insertStudent(Student stu);

     int deleteById(int id);

     int updateStudent(Student stu);

     Student findStudentByIdAndName(int id,String lastName);
}
