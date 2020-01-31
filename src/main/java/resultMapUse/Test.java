package resultMapUse;

import com.itheima.domain.Department;
import com.itheima.domain.Student;
import com.itheima.domain.StudentMapper;
import com.itheima.domain.StudentPlus;
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
    public void test01() throws Exception {

        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UseResultMap useResultMap =  sqlSession.getMapper(UseResultMap.class);
        Student stu = useResultMap.findById(1);
        System.out.println(stu.toString());

    }

    @org.junit.Test
    public void test02() throws Exception {

        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UseResultMap useResultMap =  sqlSession.getMapper(UseResultMap.class);
        StudentPlus stu = useResultMap.findByIdPlus(100);
        System.out.println(stu.toString());
      //  System.out.println(stu.toString());

    }

    @org.junit.Test
    public void test03() throws Exception {

        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UseResultMap useResultMap =  sqlSession.getMapper(UseResultMap.class);
        StudentPlus stu = useResultMap.findStuPlusByIdStep(100);
        System.out.println(stu.toString());
        //  System.out.println(stu.toString());

    }
    @org.junit.Test
    public void test04() throws Exception {

        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UseResultMap useResultMap =  sqlSession.getMapper(UseResultMap.class);
        Department stu = useResultMap.findDeptPlus(1);
        System.out.println(stu.toString());
        //  System.out.println(stu.toString());

    }

    @org.junit.Test
    public void test05() throws Exception {

        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UseResultMap useResultMap =  sqlSession.getMapper(UseResultMap.class);
        Department stu = useResultMap.findDeptPlusStep(1);
        System.out.println(stu.toString());
        //  System.out.println(stu.toString());

    }

}
