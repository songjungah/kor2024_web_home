package day63.model.entity;

import day63.model.dto.MemberDto;
import jakarta.persistence.*;
import lombok.*;

// 현재 클래스를 데이터 베이스의 테이블과 매핑 정의
@Entity
// 테이블의 이름 정의
@Table(name = "member")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity extends BaseTime {

    // ========== 테이블 필드/속성 설계 (Day59 회원테이블과 비교) ========== //
    // primary key 제약조건 정의
    @Id
    // auto_increment 제약 조건
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno;        // 회원번호

    @Column(columnDefinition = "varchar(30)", nullable = false, unique = true)
    private String mid;     // 회원아이디(not null, unique 제약조건)

    @Column(columnDefinition = "varchar(30)", nullable = false)
    private String mpwd;    // 회원비밀번호(not null 제약조건)

    @Column(columnDefinition = "varchar(10)", nullable = false)
    private String mname;   // 회원닉네임(not null 제약조건)

    @Column(columnDefinition = "varchar(13)", nullable = false, unique = true)
    private String mphone;   // 회원전화번호(not null, unique 제약조건)


    // Entity --> Dto 변환 메소드 (롬복 제공하지 않음)
    public MemberDto toDto() {
        // 빌터패턴을 이용한 인스턴스 생성
        // return 클래스명.builder().멤버변수명(새로운값).build();
        return MemberDto.builder()
                .mno(this.mno)
                .mid(this.mid)
                // 패스워드는 보안상 생략
                .mname(this.mname)
                .mphone(this.mphone)
                .build();   // .build() 빌터패턴의 끝마침
    }

}
