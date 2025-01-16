package day61;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Spring MVC 패턴에서 Repository
@Repository
public interface BoardRepository
        extends JpaRepository<BoardEntity, Integer> {
    // 해당하는 인터페이스는 BoardEntity 클래스를 조작할 예정이고,
    // pk 필드는 bno의 타입인 int --> Integer
}