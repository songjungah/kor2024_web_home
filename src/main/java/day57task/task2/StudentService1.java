package day57task.task2;

import day57task.model.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService1 {

    @Autowired
    private StudentDao1 studentDao1;

}
