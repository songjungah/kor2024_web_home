package day57task.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController2 {

    @Autowired
    private StudentService2 studentService2;

}
