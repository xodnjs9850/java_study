package day9.modi.member.pac1;

public class E {
    E() {
        D d = new D();

        d.f1 = 1;
        d.f2 = 2;
//        d.f3 = 3; // Private라 같은 패키지라도 접근 불가

        d.m1();
        d.m2();
//        d.m3(); // Private라 같은 패키지라도 접근 불가
    }
}
