package day54.boardservice13.controller;

import day54.boardservice13.model.BoardDao;
import day54.boardservice13.model.BoardDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


// ========== 콘솔 ========== //
//public class BoardController {
//
//    // 싱글톤
//    private static BoardController instance = new BoardController();
//    private BoardController(){}
//    public static BoardController getInstance() {
//        return instance;
//    }
//
//    // 1. 게시물 쓰기        [CRUD 중에 C, HTTP METHOD 중에 POST]
//    public boolean write(BoardDto boardDto) {
//        boolean result = BoardDao.getInstance().write(boardDto);
//        return result;
//    }
//
//    // 2. 게시물 전체 조회     [CRUD 중에 R, HTTP METHOD 중에 GET]
//    public ArrayList<BoardDto> findAll() {
//        ArrayList<BoardDto> result = BoardDao.getInstance().findAll();
//        return result;
//    }
//
//    // 3. 게시물 개별 조회
//
//
//    // 4. 게시물 수정
//
//
//    // 5. 게시물 삭제
//
//
//}

// ========== 웹 ========== //
@RestController     // 현재 클래스에 rest api 가 가능한 클래스임을 주입한다.
                    // [1] 클래스 위에 @RestController 넣기
public class BoardController {
    // 1. 게시물 쓰기        [CRUD 중에 C, HTTP METHOD 중에 POST]
    // [2] 함수위에 @XXXMapping("/http 주소 만들기")
    // [Test] Talend Api Tester : [POST] https://localhost:8080/write

    @PostMapping("/write")
    public boolean write(@RequestBody BoardDto boardDto) {   // body 데이터를 받기 위한 @RequestBody
        System.out.println("BoardController.write");
        System.out.println("boardDto = " + boardDto);
        boolean result = BoardDao.getInstance().write(boardDto);
        return result;
    }

    // 2. 게시물 전체 조회     [CRUD 중에 R, HTTP METHOD 중에 GET]
    // [2] 함수위에 @XXXMapping("/http 주소 만들기")
    // [Test] Talend Api Tester : [GET] https://localhost:8080/findall
    @GetMapping("/findall")
    public ArrayList<BoardDto> findAll() {
        ArrayList<BoardDto> result = BoardDao.getInstance().findAll();
        return result;
    }

    // 3. 게시물 개별 조회 [CRUD 중에 R, HTTP METHOD 중에 GET], 누구를 조회할지 bno가 매개변수로 필요로 한다.
    @GetMapping("/findid")
    // [Test] Talend Api Tester : [GET] https://localhost:8080/findid?bno=조회할 번호
    public BoardDto findid(int bno) {
        System.out.println("BoardController.findid");
        System.out.println("bno = " + bno);
        BoardDto result = BoardDao.getInstance().findid(bno);
        return result;
    }


    // 4. 게시물 수정


    // 5. 게시물 삭제


}
