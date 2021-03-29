package day12.poly.overloading;

public class Basic {

    // typeCheck(String)
    void typeCheck(String s) {
        System.out.println("문자열 1개가 들어옴");
    }

    // typeCheck(int)
    void typeCheck(int a) {
        System.out.println("정수 타입");
    }

    // typeCheck(String, int)
    void typeCheck(String s, int a) {
        System.out.println("무자열과 정수");
    }

    // // typeCheck(int, String)
    void typeCheck(int a, String s){
        System.out.println("dddd");
    }

    public static void main(String[] args) {

        Basic b = new Basic();
        b.typeCheck("dddd");
        b.typeCheck(10);
    }

}
