package returnValue;

import com.itheima.domain.Student;
import com.itheima.domain.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Test {

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("sqlFactory.xml");
        SqlSessionFactory sqlSessionFactory =  SqlSessionManager.newInstance(ins);
        return sqlSessionFactory;
    }

    @org.junit.Test
    public void test04() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        ReturnValueTest  returnValueTest = sqlSession.getMapper(ReturnValueTest.class);
       Map<String,Object> map = returnValueTest.oneToMap(1);
        System.out.println(map.toString());
    }
    @org.junit.Test
    public void test05() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        ReturnValueTest  returnValueTest = sqlSession.getMapper(ReturnValueTest.class);
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        Map<Object,Object> returnMap = returnValueTest.listToMap(list);
        System.out.println(returnMap);
    }

    @org.junit.Test
    public void test() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        ReturnValueTest  returnValueTest = sqlSession.getMapper(ReturnValueTest.class);
        Student stu = returnValueTest.SimpleDemo(1);
        System.out.println(stu);
    }


}
