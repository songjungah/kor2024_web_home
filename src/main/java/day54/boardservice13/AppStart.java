package day54.boardservice13;

import day52.boardservice8mvc.view.BoardView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication      // 스프링 웹 기본 세팅 주입, 웹 서버 실행
public class AppStart {

    // ========== 콘솔 ========== //
    // public static void main(String[] args) {
        // BoardView.getInstance().mainpage();
    // }


    // ========== 웹 ========== /
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);
    }

}
