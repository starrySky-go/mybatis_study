package hello_world;

import com.itheima.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    private SqlSessionFactory getSqlSessionFactory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("sqlFactory.xml");
        SqlSessionFactory sqlSessionFactory =  SqlSessionManager.newInstance(ins);
        return sqlSessionFactory;
    }
    @org.junit.Test
    public void test() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<Student> list = userDao.findAll();
        for(Student stu : list)
        {
            System.out.println(stu.toString());
        }
    }
}
