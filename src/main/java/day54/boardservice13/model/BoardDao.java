package day54.boardservice13.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDao {

    private Connection conn;    // 연동 인터페이스

    // 싱글톤
    private static BoardDao instance = new BoardDao();
    private BoardDao(){
        // ========== DB 연동 ========== //
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/mydb0102",
                    "root", "1234");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static BoardDao getInstance() {
        return instance;
    }

    // 1. 게시물 쓰기
    public boolean write(BoardDto boardDto) {

        try{
            // 1. SQL 작성한다.
            String sql = "insert into board(btitle, bcontent, bwriter, bpwd) values(?, ?, ?, ?)";
            // 2. 작성한 SQL를 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. 기재된 SQL의 첫번째/두번째/세번째/네번째 ? 매개변수 값 대입
            ps.setString(1, boardDto.getBtitle());
            ps.setString(2, boardDto.getBcontent());
            ps.setString(3, boardDto.getBwriter());
            ps.setString(4, boardDto.getBpwd());

            // 4. SQL 실행 => 실행된 결과 레코드 수 변환
            int count = ps.executeUpdate();
            // 5. 삽입된 결과 레코드가 1개 이면 등록 성공 true
            if(count == 1) {return true;}

        } catch (Exception e) {
            System.out.println(e);
        }
        // 5. 등록 실패 false
        return false;
    }

    // 2. 게시물 전체 조회
    public ArrayList<BoardDto> findAll() {

        ArrayList<BoardDto> list = new ArrayList<>();

        try{
            // 1. SQL를 작성한다.
            String sql = "select * from board";
            // 2. SQL를 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 실행하고 결과를 조작하는 ResultSet 인터페이스로 받는다.
            ResultSet rs = ps.executeQuery();
            // 4. 조회 결과 레코드 하나씩 조회하기 / .next() : 다음 레코드 이동
            while (rs.next()) {
                // 5. 조회 레코드를 DTO로 만들기
                BoardDto boardDto = new BoardDto(
                        // 현재 조회중인 레코드의 특정 속성의 값 반환, rs.get타입("필드명")
                        rs.getInt("bno"),
                        rs.getString("btitle"),
                        rs.getString("bcontent"),
                        rs.getString("bdate"),
                        rs.getString("bwriter"),
                        null    // 패스워드는 보안상 조회시 제외
                );
                //  6. 만든 DTO에 ArrayList 에 대입
                list.add(boardDto);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        // 7. 리스트 반환
        return list;
    }

    // 3. 게시물 개별 조회
    public BoardDto findId(int bno) {

        try{
        
        // (1) SQL 작성한다.
        String sql = "select * from board where bno = ?";
        // (2) SQL 기재한다.
        PreparedStatement ps = conn.prepareStatement(sql);
        // (3) 기재된 SQL을 매개변수로 대입한다.
        ps.setInt(1, bno);
        // (4) 기재된 SQL 실행하고 결과를 반환받는다.
        ResultSet rs = ps.executeQuery();
        // (5) 실행결과에 따른 제어를 한다.
        if (rs.next()) {
            BoardDto boardDto = new BoardDto(
                    // 현재 조회중인 레코드의 특정 속성의 값 반환, rs.get타입("필드명")
                    rs.getInt("bno"),
                    rs.getString("btitle"),
                    rs.getString("bcontent"),
                    rs.getString("bdate"),
                    rs.getString("bwriter"),
                    null    // 패스워드는 보안상 조회시 제외
                );
                return boardDto;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    // 4. 게시물 수정
    public boolean update(BoardDto boardDto) {

        try{
            String sql = "update board set btitle = ?, bcontent = ? where bno = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, boardDto.getBtitle());
            ps.setString(2, boardDto.getBcontent());
            ps.setInt(3, boardDto.getBno());
            int count = ps.executeUpdate();
            if (count == 1) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }


    // 5. 게시물 삭제
    public boolean delete(int bno) {

        try {

            // (1) SQL 작성한다.
            String sql = "select * from board where bno = ?";
            // (2) SQL 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);
            // (3) 기재된 SQL 의 매개변수를 대입한다.
            ps.setInt(1, bno);
            // (4) 기재된 SQL 실행하고 결과를 반환받는다.
            int count = ps.executeUpdate();
            // (5) 실행결과에 따른 제어한다.
            if (count == 1) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    return false;
    }
}
