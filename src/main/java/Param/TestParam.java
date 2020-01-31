package Param;

import com.itheima.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TestParam {

    Student findOne(int id);//单个参数
//    Student findStuByIdAndName(@Param("id") int id, @Param("name")String name);
    Student findStuByIdAndName(@Param("id") int id, @Param("name")String name);
    Student findStuByPojo(com.itheima.domain.Param param);
    Student findStuByMap(Map<String,Object> map);
    List<Student> findStuByList(List<Integer> idList);
}
