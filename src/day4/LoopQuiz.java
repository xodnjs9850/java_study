package day4;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int wrong = 0;
        System.out.println("난이도를 입력하세요. [상, 중, 하]");
        String level = sc.next();
        int levelNum = 0;

        switch (level) {
            case "상":
                levelNum = 1000;
                System.out.println("상급 난이도 입니다. 1 ~ 1000까지 범위로 출제됩니다.");
                break;
            case "중":
                levelNum = 100;
                System.out.println("중급 난이도 입니다. 1 ~ 100까지 범위로 출제됩니다.");
                break;
            case "하":
                levelNum = 20;
                System.out.println("하급 난이도 입니다. 1 ~ 20까지 범위로 출제됩니다.");
                break;
            default:
                levelNum = 1000;
                System.out.println("난이도를 잘못 입력했습니다. 상급 난이도로 자동 시작합니다.");
        }


        while (true){
            int rn1 = (int) (Math.random() * levelNum) + 1;
            int rn2 = (int) (Math.random() * levelNum) + 1;

            int sign = (int) (Math.random() * 4);

            String operrator = "";
            int realanswer = 0;

            switch (sign) {
                case 0:
                    operrator = "+";
                    realanswer = rn1 + rn2;
                    break;
                case 1:
                    operrator = "-";
                    if (rn1 < rn2) {
                        int temp = rn1;
                        rn1 = rn2;
                        rn1 = temp;
                    }
                    realanswer = rn1 - rn2;
                    break;
                case 2:
                    operrator = "*";
                    realanswer = rn1 * rn2;
                    break;
                case 3:
                    operrator = "/";
                    if (rn1 < rn2) {
                        int temp = rn1;
                        rn1 = rn2;
                        rn1 = temp;
                    }
                    realanswer = rn1 / rn2;
                    break;
            }


            System.out.printf("%d %s %d = ??\n", rn1, operrator, rn2);
            int answer = sc.nextInt();

            if (answer == 0){
                System.out.println("정답 횟수 : "+count);
                System.out.println("오답 횟수 : "+wrong);
                break;
            } else if (answer == realanswer) {
                System.out.println("정답!!");
                count++;
            } else {
                System.out.println("오답!!");
                wrong++;
            }

        }
    }
}
