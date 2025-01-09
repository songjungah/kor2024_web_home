package day59.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller         // 스프링 컨테이너(메모리)에 빈(인스턴스) 주입
public class ViewController {

    // 1. 메인페이지 반환하는 get매핑 함수
    @GetMapping("")
    public String index() {
        return "/day59/index.html";
    }

    // 2. 회원가입 페이지 반환하는 get매핑 함수
    @GetMapping("/signup")
    public String signup() {
        return "/day59/signup.html";
    }

    // 3. 로그인 페이지 반환하는 get매핑 함수
    @GetMapping("/login")
    public String login() {
        return "/day59/login.html";
    }

}
