package dynamic;

import com.itheima.domain.Student;

import java.util.List;

public interface DynamicUse {

     Student testif(Student student);
     List<Student> testWhere(Student student);
     List<Student> testTrim(Student student);
    List<Student> testChoose(Student student);
    List<Student> testForeach(List<Integer> list);

}
