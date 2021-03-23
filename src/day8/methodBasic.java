package day8;

import java.util.Arrays;

public class methodBasic {

    static int calculateTotal(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    static String selectRandomCode() {
        String[] foods = {"김밥", "떡볶이", "순대", "오렌지", "딸기"};
        return foods[(int) (Math.random() * foods.length)];
    }

    //n개의 정수를 구하는 함수
    static int sumNumber(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    //사용자의 이름을 전달하면 인사를 출력해주는 함수
    static void outputName(String username) {
        System.out.println("username : " + username);
    }

    // 여러 값을 리턴하고 싶은 경우
    static int[] operateAll(int n1, int n2) {
        return new int[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }


    public static void main(String[] args) {

        // 1부터 n까지의 총합을 구해주는 로직
        int result = calculateTotal(10);
        System.out.println("result = " + result);

        int result2 = calculateTotal(100);
        System.out.println("result2 = " + result2);

        System.out.println("selectRandomCode() = " + selectRandomCode());

        int total = sumNumber(new int[]{10, 20, 30, 100, 200});
        System.out.println("total = " + total);

        int total2 = sumNumber(10, 20, 30, 100);
        System.out.println("total2 = " + total2);

        System.out.println("-------------------------------------------------");
        outputName("kim");

        int[] results = operateAll(20, 50);
        System.out.println(Arrays.toString(results));

    }
}
