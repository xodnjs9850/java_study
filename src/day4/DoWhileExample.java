package day4;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        int total = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);
        // while의 시작조건이 시작부터 false
        /*while (num != 0) {
            System.out.println("정수(0입력시 종료): ");
            num = sc.nextInt();
            total += num;
        }*/
        do {
            System.out.print("정수(0입력시 종료): ");
            num = sc.nextInt();
            total += num;
        } while (num != 0);

        System.out.println("입력 누적값 : "+total);
        sc.close();
    }
}
