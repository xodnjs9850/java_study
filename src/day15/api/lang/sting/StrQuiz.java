package day15.api.lang.sting;

import java.util.Scanner;

public class StrQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요.");
        System.out.print(">> ");
        String SocialNumber = sc.nextLine();

        String[] splitNumbers = SocialNumber.split("-");

        System.out.printf("앞자리 : %s\n" ,splitNumbers[0]);
        System.out.printf("뒷자리 : %s\n", splitNumbers[1]);

        String year = splitNumbers[0].substring(0, 2);
        String month = splitNumbers[0].substring(2, 4);
        String day = splitNumbers[0].substring(4, 6);
        String gender = splitNumbers[1].substring(0, 1);

        if (splitNumbers[0].charAt(0) == '0') {
            String some = "20"+year;
            int age = 2021 - Integer.parseInt(some);
            if(gender.equals("3")) {
                System.out.printf("20%s년도 %s월 %s일생 %d세 남자\n", year, month, day, age);
            } else if(gender.equals("4")) {
                System.out.printf("20%s년도 %s월 %s일생 %d세 여자\n", year, month, day, age);
            }
        } else {
            String some = "19"+year;
            int age = 2021 - Integer.parseInt(some);
            if(gender.equals("1")) {
                System.out.printf("19%s년도 %s월 %s일생 %d세 남자\n", year, month, day, age);
            } else if(gender.equals("2")) {
                System.out.printf("19%s년도 %s월 %s일생 %d세 여자\n", year, month, day, age);
            }
        }


    }
}
