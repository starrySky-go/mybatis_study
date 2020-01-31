import com.itheima.domain.Student;
import com.itheima.domain.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import pratices.GeneratedKey.UserDao;

import java.io.IOException;
import java.io.InputStream;


public class Test {

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("sqlFactory.xml");
        SqlSessionFactory sqlSessionFactory =  SqlSessionManager.newInstance(ins);
        return sqlSessionFactory;
    }

    @org.junit.Test
    public void test01() throws Exception {

        SqlSession sqlSession = getSqlSessionFactory().openSession();
        Student student = sqlSession.selectOne("getStudentById",1);
        System.out.println(student);

    }
    @org.junit.Test
    public void test02() throws IOException {
       // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student stu = studentMapper.getStudentById(1);
        System.out.println(stu);
    }

    @org.junit.Test
    public void test03() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
       Student stu = studentMapper.getStudentById(1);
       System.out.println(stu.toString());
       stu.setId(100);
       studentMapper.insertStudent(stu);
       sqlSession.commit();
//        stu.setName("ddd");
//        stu.setYear(66);
//        stu.setGender("1");
//        System.out.println(stu);
//        int num = studentMapper.updateStudent(stu);
//        System.out.println(num);
        studentMapper.deleteById(1);
        //studentMapper.deleteById(1);

    }

    @org.junit.Test
    public void test04() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student stu = studentMapper.findStudentByIdAndName(1,"ddd");
        System.out.println(stu);
    }



}
