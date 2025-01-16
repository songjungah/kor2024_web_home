package day62.model.entity;

import jakarta.persistence.*;
import lombok.*;

// 1. 해당 클래스를 DB의 테이블과 매핑 정의한다.
@Entity
// 2. 해당 엔티티와 매핑된 테이블의 이름을 정의한다.
@Table(name = "board")

// 롬복 어노테이션
@Getter     // private 멤버변수를 접근 get 메소드를 생성한다.
@Setter     // private 멤버변수를 접근 set 메소드를 생성한다.
@ToString   // toString 메소드 : 객체 출력시 멤머변수의 값 반환함수.
@Builder    // 객체 생성시 생성자가 아닌 유연하게 객체를 만들기 위한 (빌더)패턴
@NoArgsConstructor  // 빈생성자
@AllArgsConstructor // 모든 매개변수 생성자
public class BoardEntity {

    // ID : 해당 필드/속성의 제약조건에 Primary key를 정의하는 어노테이션.
    @Id
    // mysql의 auto_increment의 제약조관가 동일한 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bno;
    // Column : 해당 필드/속성의 타입, 제약조건을 정의하는 어노테이션
    @Column(columnDefinition = "varchar(100)", nullable = false)
    private String btitle;

    @Column(columnDefinition = "longtext", nullable = false)
    private String bcontetn;

    @Column(columnDefinition = "varchar(30)", nullable = false)
    private String bwriter;

    @Column(columnDefinition = "varchar(30)", nullable = false)
    private String bpwd;

}