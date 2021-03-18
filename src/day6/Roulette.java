package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {

        String[] player;
        Scanner sc = new Scanner(System.in);

        System.out.print("게임 인원을 입력하세요.(2 ~ 4명) ==> ");
        int playerCount = sc.nextInt();

        while (true) {
            if (playerCount > 4) {
                System.out.println("인원 수를 제대로 입력하세요.");
                return;
            }

            player = new String[playerCount];

            // player 배열 초기화
            for (int i = 0; i < playerCount; i++) {
                System.out.printf("%d번째 플레이어 이름을 등록하세요.\n", i+1);
                System.out.print(">> ");
                String playerName = sc.next();
                player[i] = playerName;
            }

            System.out.println(Arrays.toString(player) + "참가!");

            System.out.println("실탄의 갯수를 입력하세요.(6미만)");
            System.out.print("> ");
            int realBullet = sc.nextInt();

            if (realBullet > 6) {
                System.out.println("총알의 갯수를 제대로 입력하세요.");
                return;
            }

            System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
            boolean[] bullet = new boolean[6];
            int count = 0;

            while (count < realBullet) {
                int rn = (int) (Math.random() * 6);
                if (bullet[rn] == false) {
                    bullet[rn] = true;
                    count++;
                }
            }
            System.out.println(Arrays.toString(bullet));

            System.out.println("총을 돌렸습니다.");
            int rnmember = (int)(Math.random() * playerCount);
            System.out.printf("%s부터 시작합니다.\n", player[rnmember]);

            while (true) {
                System.out.printf("%s의 턴 : 엔터를 누르면 격발합니다.\n", player[rnmember]);
                sc.nextLine();
                sc.nextLine();
                if (bullet[rnmember]) {
                    System.out.printf("탕!!! %s가 죽었습니다.\n", player[rnmember]);
                    return;

                } else {
                    System.out.println("운이 좋네요. 살았습니다.");
                    if (rnmember == player.length) {
                        rnmember = 0;
                    } else {
                        rnmember++;
                    }
                }
            }
        }
    }
}
