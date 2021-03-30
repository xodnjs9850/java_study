package day13.abs.exception;

public class TryCatchEx1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 2;
        System.out.println("나눗셈 시작");

        try {
            // 예외 발생 가능성이 있는 코드를 예외처리
            System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
        } catch (Exception e) {
            // 예외 발생시 실행할 코드
            System.out.println("ArithmeticException 에러 발생 프로그램 강제 종료");
            return;
        }
            System.out.println("프로그램 정상 종료!");
    }

}
