package day52.boardservice8mvc.view;

import day52.boardservice8mvc.controller.BoardController;
import day52.boardservice8mvc.model.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {

    // 싱글톤이란? 프로그램내 1개만 존재 가능한 디자인 패턴
    // 싱글톤 만들기
    private BoardView(){}
    private static BoardView instance = new BoardView();
    public static BoardView getInstance() {
        return instance;
    }

    // 입력 객체
    private Scanner scan = new Scanner(System.in);

    // 0. 메인페이지
    public void run(){  // rus s
        while (true) {  // while s
            System.out.println("1. 등록   2. 출력 : ");
            int choose = scan.nextInt();

            if (choose == 1) {
                write();
            } else if (choose == 2) {
                findAll();
            }

        }   // while e
    }   // run e

    // 1. 게시물 쓰기 페이지 함수
    public void write() {
        System.out.println("[게시물 쓰기 페이지]");
        System.out.println("title : ");     String title = scan.next();
        System.out.println("content : ");   String content = scan.next();
        System.out.println("password : ");  int pwd = scan.nextInt();

        BoardDto boardDto = new BoardDto(title, content, pwd);

        boolean result = BoardController.getInstance().write(boardDto);
        if (result) {
            System.out.println("write success");
        } else {
            System.out.println("write fail");
        }
    }

    // 2. 게시물 출력 페이지 함수
    public void findAll() {
        System.out.println("[게시물 출력 페이지]");

        ArrayList<BoardDto> result = BoardController.getInstance().findAll();

        for(int index = 0; index <= result.size()-1; index++) {
            System.out.println("제목 : " + result.get(index).getTitle());
            System.out.println("내용 : " + result.get(index).getContent());
            System.out.println();
        }
    }

}
