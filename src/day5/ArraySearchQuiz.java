package day5;

import java.util.*;

public class ArraySearchQuiz {
    public static void main(String[] args) {

        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("변경 전 정보 : "+Arrays.toString(member));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String memberName = sc.nextLine();

            boolean hasMember = false;
            int index;

            for (index = 0; index < member.length; index++) {
                if (memberName.equals(member[index])) {
                    hasMember = true;
                    break;
                }
            }

            if (hasMember) {
                System.out.printf("%s의 별명을 변경합니다.\n", member[index]);
                System.out.print("> ");
                member[index] = sc.next();
                System.out.println("변경완료!");
                System.out.print("변경 후 정보 : " + Arrays.toString(member));
                break;
            } else {
                System.out.printf("%s는(은) 없는 멤버입니다.\n", memberName);
            }
        }

    }
}
