package day59.model.dto;

import lombok.*;

// 롬복 : 반복되는 코드를 자동으로 주입해주는 라이브러리
@NoArgsConstructor      // 디폴트 생정자
@AllArgsConstructor     // 모든 매개변수를 갖는 생성자
@Getter                 // getter 메소드
@Setter                 // setter 메소드
@ToString               // toString 메소드
@Builder                // 빌더 패던 제공
public class MemberDto {

    private int mno;
    private String mid;
    private String mpwd;
    private String mname;
    private String mphone;

}
