package day54.boardservice13.controller;

import day54.boardservice13.model.BoardDao;
import day54.boardservice13.model.BoardDto;
import org.springframework.web.bind.annotation.*;

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
    // [TEST] Talend Api Tester : [POST] http://localhost:8080/write
    //                            [Headers] Content-Type : application/json
    //                            [body] {"btitle" : "테스트제목" , "bcontent" : "테스트내용" , "bwriter" : "유재석" ,"bpwd" : "1234" }

    @PostMapping("/write")
    public boolean write(@RequestBody BoardDto boardDto) {   // body 데이터를 받기 위한 @RequestBody
        System.out.println("BoardController.write");        // soutm : 메소드명 출력함수 자동완성
        System.out.println("boardDto = " + boardDto);       // soutp : 메소드 매개변수 출력함수 자동완성
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
    public BoardDto findId(@RequestParam int bno) {
        System.out.println("BoardController.findId");
        System.out.println("bno = " + bno);
        BoardDto result = BoardDao.getInstance().findId(bno);
        return result;
    }


    // 4. 게시물 수정 [CRUD 중에 U, HTTP METHOD 중에 PUT]
    // [TEST] Talend Api Tester : [PUT] http://localhost:8080/update
    //                            [Headers] Content-Type : application/json
    //                            [body] {"bno" : 3, btitle" : "수정제목" , "bcontent" : "수정내용"}
    @PutMapping("/update")
    public boolean update(@RequestBody BoardDto boardDto) {
        System.out.println("BoardController.update");
        System.out.println("boardDto = " + boardDto);
        boolean result = BoardDao.getInstance().update(boardDto);
        return result;
    }

    // 5. 게시물 삭제 [ CRUD 중에 D , HTTP METHOD 중에 DELETE , 쿼리스트링 ]
    @DeleteMapping("/delete")
    // [TEST] Talend Api Tester : [Delete] http://localhost:8080/delete?bno=1
    public boolean delete(@RequestParam int bno) {
        System.out.println("BoardController.delete");
        System.out.println("bno = " + bno);
        boolean result = BoardDao.getInstance().delete(bno);
        return result;
    }

}
