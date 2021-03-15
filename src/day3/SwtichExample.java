package day3;

import java.util.Scanner;

public class SwtichExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[여행을 원하는 계절을 입력하세요]");
        System.out.print(">> ");

        String season = scanner.next();

        // switch에는 문자, 정수형 변수 이외에는 작성 불가능!
        switch (season) {
            case "spring" :
            case "봄" :
                System.out.println("벗꽃 구경은 어떤가요?");
                break;

            case  "summer" :
            case "여름" :
                System.out.println("해수욕장은 어떤가요?");
                break;

            case "가을" :
                System.out.println("단풍보러 가");
                break;

            case "겨울" :
                System.out.println("춥다 집에나 있자");
                break;

            default:
                System.out.println("가지마 그냥");
        }
        scanner.close();
    }
}
