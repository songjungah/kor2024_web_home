package day61;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppStart {

    @Autowired
    static BoardRepository boardRepository;

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);

        // (1) BoardEntity 클래스로 인스턴스 생성
        // new BoardEntity1 : 인스턴스 1, 엔티티 1개
        BoardEntity boardEntity1 = new BoardEntity(1, "안녕제목", "안녕내용");

        // new BoardEntity2 : 인스턴스 2, 엔티티 1개
        BoardEntity boardEntity2 = new BoardEntity(2, "안녕제목2", "안녕내용2");

        // 퍼시스턴스 : 영속성 JPA

        // 1. 모든 엔티티 호출함수
        // boardRepository.findAll();
        // 2. 엔티티의 테이블에 저장하는 함수.(영속성)
        // .save(엔티티/인스턴스)
        boardRepository.save(boardEntity1);
        boardRepository.save(boardEntity2);

        List<BoardEntity> list = boardRepository.findAll();

    }
}