package day57task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// * MVC 관련 컴포넌트(클래스)들을 스캔(찾아서)해서 등록 처리한다.
@SpringBootApplication
public class AppStart {

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);
    }

}