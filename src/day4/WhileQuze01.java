package day4;

import java.util.Scanner;

public class WhileQuze01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 1 : ");
        int num1 = sc.nextInt();
        int origin = num1;

        System.out.print("정수 2 : ");
        int num2 = sc.nextInt();

        int total = 0;

        while (num1 <= num2) {
           total += num1;
           num1++;
        }
        System.out.printf("%d ~ %d까지의 총합 : %d", origin, num2, total);

        sc.close();

    }
}
