package day54.boardservice13.model;

public class BoardDto {

    // 1. 멤버변수, 최대한 db의 테이블 속성과 동일
    private int bno;
    private String btitle;
    private String bcontent;
    private String bdate;
    private String bwriter;
    private String bpwd;

    // 2. 생성자, 주로 1. 빈생성자 2. 풀생성자 정도는 필수 + 필요에 따라 만들어서 사용
        // class 내 빈공간을 오른쪽 클릭 [Generate] -> [Constructor]
    public BoardDto(){}
    public BoardDto(int bno, String btitle, String bcontent, String bdate, String bwriter, String bpwd) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bdate = bdate;
        this.bwriter = bwriter;
        this.bpwd = bpwd;
    }

    // 3. getter/setter, toString()
    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public String getBpwd() {
        return bpwd;
    }

    public void setBpwd(String bpwd) {
        this.bpwd = bpwd;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bdate='" + bdate + '\'' +
                ", bwriter='" + bwriter + '\'' +
                ", bpwd='" + bpwd + '\'' +
                '}';
    }
}
