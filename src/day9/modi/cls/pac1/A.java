package day9.modi.cls.pac1;

import day9.modi.cls.pac2.C;

// 접근제한자 자리에 아무것도 쓰지 않으면 default 제한이 걸린다.
// 클래스는 default, public 제한만 사용 가능
class A {
        public  int f1;
        public int f2;

        public void m1() {
            B b = new B();
            C c = new C();
        }
        public void m2() {}
}
