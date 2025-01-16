package day62.controller;

import day62.model.entity.BoardEntity;
import day62.service.BoardService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// MVC 컴포넌트 공통 : 컴포넌트 스캔을 통해 자동으로 스프링 컨테이너에 빈(인스턴스) 색성한다. (싱글톤 X)
// 1. 사용자가 보내는 HTTP 요청은 모두 Controller 에서 찾는다. (HTTP가 요청이 들어오고 응답이 가는 곳)
public class BoardController {
    // 싱글톤X : 스프링은 자동으로 빈(인스턴스)를 생성하고 관리를 해준다. 개발자가 인스턴스 관리를 Spring 에게 위임하다. IOC > 제어의 역전
    @Autowired private BoardService boardService;
    // 컨트롤러는 무조건 서비스에게 요청을 하고 응답을 받는다.
    // 규칙 : 컨트롤러에서 리포지토리/엔티티 객체를 사용하면 안된다.

    // 프레임워크가 관례적으로 CRUD 구현할 때 사용되는 어노테이션
    // C : @PostMapping, R : @GetMapping, U : @PutMappint, D : DeleteMapping : ( "HTTP 매핑 주소 정의" )
    // HTTP 요청 데이터 전송방식 : 1. HTTP Header body @RequestBody VS 2. queryString @RequestParam


    // C : 게시물 쓰기
    @PostMapping("/write")  // localhost:8080/write
    // body : {"btitle" : "제목1" ,"bcontent" : "내용1" ,"bwriter" : "작성자1" ,"bpwd" : "1234" }
    public boolean write(@RequestBody BoardEntity boardEntity) {
        return boardService.write(boardEntity);
    }

    // R : 게시물 전체 조회
    @GetMapping("/printall")    // localhost:8080/printall
    public List<BoardEntity> printAll() {
        return boardService.printall();
    }

    // R : 게시물 개별 조회
    @GetMapping("/print")   // localhost:8080/print
    public BoardEntity print(@RequestParam int bno) {
        return boardService.print(bno);
    }

    // U : 게시물 수정
    @PutMapping("/update")  // localhost:8080/update
    public boolean update(@RequestBody BoardEntity boardEntity) {
        return boardService.update(boardEntity);
    }

    // D : 게시물 삭제
    @DeleteMapping("/delete")   // localhost:8080/delete
    public boolean delete(@RequestParam int bno) {
        return boardService.delete(bno);
    }

}