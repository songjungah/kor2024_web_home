package day57task.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController1 {

    @Autowired
    private StudentService1 studentService1;

}
