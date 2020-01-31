package Param;

import com.itheima.domain.Param;
import com.itheima.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;
import pratices.GeneratedKey.UserDao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("sqlFactory.xml");
        SqlSessionFactory sqlSessionFactory =  SqlSessionManager.newInstance(ins);
        return sqlSessionFactory;
    }

    @org.junit.Test
    public void test05() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession(true);
        TestParam testParam = sqlSession.getMapper(TestParam.class);
        Student stu = testParam.findOne(2);
        System.out.println(stu);
    }

    @org.junit.Test
    public void test06() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession(true);
        TestParam testParam = sqlSession.getMapper(TestParam.class);
//        Student stu = testParam.findStuByIdAndName(1,"ddd");
        Param param = new Param(1,"ddd");
        Student stu = testParam.findStuByPojo(param);
        System.out.println(stu.toString());
    }
    @org.junit.Test
    public void test07() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession(true);
        TestParam testParam = sqlSession.getMapper(TestParam.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);
        map.put("name","ddd");
        Student stu = testParam.findStuByMap(map);
        System.out.println(stu);
    }

    @org.junit.Test
    public void test08() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession(true);
        TestParam testParam = sqlSession.getMapper(TestParam.class);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        List<Student> studentList = testParam.findStuByList(list);
        for(Student stu : studentList){
            System.out.println(stu.toString());
        }
    }
    //#和$取值的区别

    @org.junit.Test
    public void test() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession(true);
        TestParam testParam = sqlSession.getMapper(TestParam.class);
        Student stu = testParam.findStuByIdAndName(1,"ddd");
        System.out.println(stu.toString());
    }


}
