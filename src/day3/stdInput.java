package day3;

import java.util.Scanner;

public class stdInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 스캐너 함수로 입력 처리
        // next(), nextLine(): 문자열 입력처리, next는 공백 입력 불가
        //nextInt(), nextDouble() : 정수와 실수를 입력 처리

        System.out.println("이름을 입력하세요.");
        String name = sc.next();

        System.out.println(name);

    }
}
