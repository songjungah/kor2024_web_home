package day63.model.dto;

import day63.model.entity.MemberEntity;
import lombok.*;

// 롬복
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    // 멤버변수
    private int mno;
    private String mid;
    private String mpwd;
    private String mname;
    private String mphone;
    private String cdate;   // 회원가입 날짜/시간
    private String udate;   // 회원정보 수정날짜/시간


    // Dto --> Entity(중복 제공 하지 않음)
    public MemberEntity toEntity() {
        // (1) 빌더패턴 : 인스턴스를 생성자를 이용하여 만들었다면 규칙이 존재하다.
        //               유연한 인스턴스 생성하는 방법 제시
        //               인스턴스를 생성할 때 생성자보다 유연한 생성 방법 제시
        // return 클래스명.builder().멤버변수명(새로운값).build();
        return MemberEntity.builder()
                .mno(this.mno)
                .mid(this.mid)
                .mpwd(this.mpwd)
                .mname(this.mname)
                .mphone(this.mphone)
                .build();
    }


}
