package day57task.task2;

import lombok.*;

@NoArgsConstructor      // 디폴트 생성자 주입
@AllArgsConstructor     // 모든 매개변수 생성자 주입
@Getter                 // 각 멤버변수 getter 메소드 주입
@Setter                 // 각 멤버변수 setter 메소드 주입
@ToString               // 참조(주소)값 대신 멤버변수 호출 메소드 주입
@Builder                // 생성자 대신 인스턴스(객체) 만드는 빌터 패턴 주입
public class StudentDto1 {

    private int sno;
    private String sname;
    private int skor;
    private int smath;
    private int seng;

}
