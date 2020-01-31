package hello_world;

import com.itheima.domain.Student;

import java.util.List;

public interface UserDao {

     List<Student> findAll();
}
