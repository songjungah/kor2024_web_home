package day57task.controller;

import day57task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController     // + 객체(빈) 생성해서 메모리(Spring 컨테이너) 등록
// 이 클래스의 객체(빈) 는 너가(Spring) 이 관리 해줘 : IOC(제어역전)
// 싱글톤이 필요가 없어졌다.
public class StudentController {

    // 너(Spring)가 만든 클래스의 객체/인스턴스 를 주세요.
    @Autowired
    private StudentService studentService;

}