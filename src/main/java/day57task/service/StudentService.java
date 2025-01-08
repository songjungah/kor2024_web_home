package day57task.service;

import day57task.model.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service        // + 객체(빈) 생성해서 메모리(Spring 컨테이너) 등록
// 이 클래스의 객체(빈) 는 너가(Spring) 이 관리 해줘 : IOC(제어역전)
// 싱글톤이 필요가 없어졌다.
public class StudentService {

    // 너(Spring)가 만들었던 빈(객체)를 주세요.
    @Autowired
    private StudentDao studentDao;


}