package day5;

import java.util.*;

public class ArrayDelQuiz {
    public static void main(String[] args) {

        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        Scanner sc = new Scanner(System.in);

        System.out.println("* 현재 남은 멤버들 : " + Arrays.toString(member));

        String[] temp = new String[member.length];

        while (true) {
            System.out.println("-삭제할 학생의 별명을 입력하세요.");
            System.out.print("> ");
            String delMember = sc.next();

            int delIndex = 0;

            for (int i = 0; i < member.length; i++) {
                if (delMember.equals(member[i])) {
                    delIndex = i;
                    System.out.printf("%s를 삭제합니다.\n", delMember);
                    break;
                }
            }

            for (int i = delIndex; i < member.length - 1; i++) {
                member[i] = member[i+1];
            }

            for (int i = 0; i < temp.length; i++) {
                temp[i] = member[i];
            }

            member = temp;
            temp = null;
            System.out.println("삭제 후 정보 : " + Arrays.toString(member));



        }

    }

}

