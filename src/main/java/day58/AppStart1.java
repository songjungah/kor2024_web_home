package day58;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AppStart1 {

    public static void main(String[] args) {
        SpringApplication.run(AppStart1.class);
    }

    @Controller
    class ViewController1{

        @GetMapping("")
        public String index() {
            return "/day58/index.html";
        }

        @GetMapping("/layout")
        public String index2() {
            return "/day58/layout/index.hyml";
        }

        @GetMapping("/student")
        public String index3() {
            return "/day58/student2/index1.html";
        }

        @GetMapping("/student/regist")
        public String regist() {
            return "/day58/student2/regist1.html";
        }

        @GetMapping("/student/list")
        public String list() {
            return "/day58/student2/list1.html";
        }

        @GetMapping("/student/info")
        public String info() {
            return "/day58/student2/info.html";
        }

        @GetMapping("/student/update")
        public String update() {
            return "/day58/student2/update.html";
        }

        @GetMapping("/student/delete")
        public String delete() {
            return "/day58/student2/delete.html";
        }

    }

}
