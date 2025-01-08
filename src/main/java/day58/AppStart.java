package day58;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);
    }
}

// 화면은 Rest 라는 컨트롤러를 사용하지 않음.
@Controller     // @ : 미리 만들어진 코드 및 정보들을 알려주는 (스티커)
class ViewController{

    @GetMapping("")     // 템플릿 파일 반환하는 HTTP URL 정의
    public String index() {
        return "/day58/index.html";      // index.html 템플릿 파일 반환
    }

    @GetMapping("/layout")     // 매핑/연결 할 HTTP URL 정의
    public String index2() {
        return "/day58/layout/index.html";  // index.html 플릿 파일 반환
    }

    @GetMapping("/student")
    public String index3() {
        return "/day58/Student/index.html";     // index.html 플릿 파일 반환
    }
}