package day13.abs.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc= null;

        try {
            System.out.print("정수1 : ");
            int n1 = sc.nextInt(); // Warning

            System.out.print("정수2 : ");
            int n2 = sc.nextInt(); // Warning

            int divResult = n1 / n2; // Warning
            System.out.println("divResult : " + divResult);
        } catch (InputMismatchException e) {
            System.out.println("입력 에러 발생 정수만 입력하세요.");
        } catch (ArithmeticException e) {
            System.out.println("연산 에러 발생 0으로 나눌 수는 없습니다.");
        } catch (Exception e) {
            System.out.printf("%s 에러가 발생\n", e);
            System.out.println("프로그램 강제 종료");
        }

        System.out.println("프로그램 정상 종료");
        sc.close();

    }

}
