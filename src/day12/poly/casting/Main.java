package day12.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        System.out.println("-------------------------------------");

        Parent child = new Child();
        child.m1();
        child.m2();
        ((Child)child).m3();

        System.out.println("-----------------------------------------");

        // 다운캐스팅은 한번 업 캐스팅된 객체만 사용 가능
        // Child c = (Child) new Parent();

        Parent p = new Parent();
        if (p instanceof Child) {
            Child c = (Child) p;
        } else {
            System.out.println("변환 수행 X");
        }

    }
}
