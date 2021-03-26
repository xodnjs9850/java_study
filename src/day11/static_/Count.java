package day11.static_;

public class Count {

    public int x; // 인스턴트 필드
    public static int y; // 정적 필드

    public void method1() {
        int z = this.x + this.y;
        System.out.println("z(instance) = " + z);
    }

    public static void method2(Count c) {
        // static 블록 내에서는 인스턴스 멤버를 직접 사용할 수 없다.
//        int z = x + y;
        int z = c.x + y ;
        c.method1();
    }

}
