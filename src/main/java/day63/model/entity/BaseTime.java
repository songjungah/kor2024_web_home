package day63.model.entity;


import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
// 슈퍼클래스 목적으로 사용할 클래스(자체적인 매핑없음)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTime {

    // 엔티티 생성날짜/시간
    @CreatedDate
    private LocalDateTime cdate;

    // 엔티티 수정된 날짜/시간
    @LastModifiedDate
    private LocalDateTime udate;

}
