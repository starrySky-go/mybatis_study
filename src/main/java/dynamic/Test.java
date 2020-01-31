package dynamic;

import com.itheima.domain.Student;
import com.itheima.domain.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test {

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("sqlFactory.xml");
        SqlSessionFactory sqlSessionFactory =  SqlSessionManager.newInstance(ins);
        return sqlSessionFactory;
    }

    @org.junit.Test
    public void testIf() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        DynamicUse studentMapper = sqlSession.getMapper(DynamicUse.class);
        Student student = new Student(null,"ddd",null,22);
        Student stu = studentMapper.testif(student);
        System.out.println(stu);
    }

    @org.junit.Test
    public void testWhere() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        DynamicUse studentMapper = sqlSession.getMapper(DynamicUse.class);
        Student student = new Student(null,"ddd",null,22);
        List<Student> stu = studentMapper.testWhere(student);
        System.out.println(stu);
    }

    @org.junit.Test
    public void testTrim() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        DynamicUse studentMapper = sqlSession.getMapper(DynamicUse.class);
        Student student = new Student(null,"ddd",null,null);
        List<Student> stu = studentMapper.testTrim(student);
        System.out.println(stu);
    }
    @org.junit.Test
    public void testChoose() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        DynamicUse studentMapper = sqlSession.getMapper(DynamicUse.class);
        Student student = new Student(null,"ddd",null,null);
        List<Student> stu =    studentMapper.testChoose(student);
        System.out.println(stu);
    }

    @org.junit.Test
    public void testForeach() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        DynamicUse studentMapper = sqlSession.getMapper(DynamicUse.class);
       // Student student = new Student(null,"ddd",null,null);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        List<Student> stu = studentMapper.testForeach(list);
        System.out.println(stu);
    }
}
