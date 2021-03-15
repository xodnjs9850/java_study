package day3;

import java.util.Scanner;

public class ConditionalOperlator {
    public static void main(String[] args) {
        // int money = 6000;

        Scanner sc = new Scanner(System.in);
        System.out.println("돈을 입력하세요.");
        int money = sc.nextInt();
        sc.close();
        System.out.println("가진 돈 : " + money);

        // String food = money >= 5000 ? "육계장" : "라면";
        // 비트 연산
        byte a = 5; // 0000 0101
        byte b = 3; // 0000 0011

        System.out.println(a & b); // 0000 0001
        System.out.println(a | b); // 0000 0111
        System.out.println(a ^ b); // 0000 0110

        // 비트 이동 연산
        int x = 192;
        System.out.println(x << 3);
        System.out.println(x >> 2);

        // 비트 반전 (단항)
        int y = 8;
        System.out.println(~y);
    }
}
