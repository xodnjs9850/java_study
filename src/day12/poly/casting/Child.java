package day12.poly.casting;

public class Child extends Parent {

    @Override
    void m2() {
        System.out.println("오버라이딩된 자식의 2번 메소드");
    }

    void m3() {
        System.out.println("자식의 3번 메소드");
    }

}
