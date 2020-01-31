package pratices.GeneratedKey;

import com.itheima.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        InputStream ins = Resources.getResourceAsStream("sqlFactory.xml");
        SqlSessionFactory sqlSessionFactory =  SqlSessionManager.newInstance(ins);
        return sqlSessionFactory;
    }

    @org.junit.Test
    public void test05() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession(true);
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Student stu = new Student(null, "fff", "0", 32);
        userDao.insert(stu);
        System.out.println(stu.toString());
    }
}
