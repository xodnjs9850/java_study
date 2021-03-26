package day11.final_;

public class Korean {

    String name; // 이름
    // 상수
    static final String NATION = "대한민국"; // 국적
    final String ssn; // 주민번호

    Korean(String name, String ssn) {
        // final 필드는 data를 변경할 수 없음 외부에서도 변경 불가
//        nation = "미국";
        this.name = name;
        this.ssn = ssn;
    }

}
