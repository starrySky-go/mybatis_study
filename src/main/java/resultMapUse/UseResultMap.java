package resultMapUse;

import com.itheima.domain.Department;
import com.itheima.domain.Student;
import com.itheima.domain.StudentPlus;

public interface UseResultMap {
    Student findById(int id);

    StudentPlus findByIdPlus(int id);
    StudentPlus findStuPlusByIdStep(int id);

    Department findDeptPlus(int id);
    Department findDeptPlusStep(int id);
}
