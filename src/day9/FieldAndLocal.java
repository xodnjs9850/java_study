package day9;

class Test {
    int fVar;  // 필드 : 객체의 속성

    void methodTest(int param) {  // 매개 변수 : 메서드를 실행하기 위한 매개값 저장 용도
        int local = param;  // 지역 변수 : 메서드 안에서만 사용하는 변수

        System.out.println("fVar = " + fVar);
        System.out.println("param = " + param);
        System.out.println("local = " + local);
    }
}

public class FieldAndLocal {

    public static void main(String[] args) {
        Test t = new Test();
        t.methodTest(10);

    }

}
