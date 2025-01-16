package day64.객체연관관계;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

// 룸복
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class 회원 {
    
    private int 회원번호;
    private String 회원아이디;
    private String 회원이름;

    // 양방향 : 회원객체는 여러개 게시물을 작성할 수 있으므로 List 타입
    @Builder.Default        // 빌더패턴 사용시 초기값이 대입되지 않는 멤버변수에 대해서는 초기값을 자동으로 대입한다.
    @ToString.Exclude       // ToString 을 제외하는 멤버변수 정의
    List<게시물> 작성한게시물 = new ArrayList<>();

    @Builder.Default
    @ToString.Exclude
    List<댓글> 작성한댓글 = new ArrayList<>();

    // 양방향 주의할 점 : 두 객체가 서로 참조할 때는 순환참조(무한 호출/참조) 에 주의해야한다.
    // 해결방안1 : ToString 메소드를 사용하지 않는다.
    // 해결방안2 : 참조 멤버변수만 ToString 메소드를 사용하지 않는다.     @ToString.Exclude
    // ToString() 메소드란? Object 클래스의 메소드로써 객체의 멤버변수 값을 반환하는 함수
        // ToString() 사용하지 않으면 객체 참조시 주소값이 반환(기본값)
    
}
