package day11.static_;

public class Calculator {

    String madeBy; // 제조사
    String color; // 색상
    static double pi; // 원주율

    Calculator() {
        pi = 3.14;
    }

    // 정적 초기화자(static innitialize)
    // 정적 데이터의 초기값을 세팅.
    static {
        System.out.println("정적 데이터 생성!!");
        pi = 3.14;
    }

    // 메서드 내부에서 this 필드(인스턴스 필드)가 피요하면 non-static
    // this 필드가 필요없으면 static
    void paint(String color) {
        this.color = color;
    }

    static double calcAreaCircle(int r) {
        return pi * r * r;
    }
}
