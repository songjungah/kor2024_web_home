package day56.controller2;


public class RestDto_1 {

    // 멤버변수
    private String key1;
    private String key2;

    // 생성자
    public RestDto_1() {}

    public RestDto_1(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    // 메소드, toString
    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    @Override
    public String toString() {
        return "RestDto_1{" +
                "key1='" + key1 + '\'' +
                ", key2='" + key2 + '\'' +
                '}';
    }
}
