package returnValue;

import com.itheima.domain.Student;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface ReturnValueTest {

    //将一条记录使用map形式展示出来,key为数据库的列名,value为其对应的值
     Map<String,Object> oneToMap(int id);

     @MapKey("id")//使用数据库中数据的值
    Map<Object,Object> listToMap(List<Integer> list);

     Student SimpleDemo(Integer id);
}
