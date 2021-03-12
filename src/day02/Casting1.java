package day02;

public class Casting1 {
    public static void main(String[] args) {
//        묵시적 형변환
        byte a = 100;
        int b = a; // a가 int로 자동 형변환

        double c = b; // b가 double로 자동 형변환
        System.out.println(c);

        // 명시적 형변환
        int n = 1000;
        byte m = (byte)n;
        System.out.println(m);

        double d = 500.3333;
        int i = (int)d;
        System.out.println(i);
    }
}
