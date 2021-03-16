package day4;

public class ForQuiz {
    public static void main(String[] args) {
        /*  
             # 공식 : X 이상 Y 이하의 랜덤 정수
            (int) (Math.random() * (y - x + 1)) + x;
        */
        int number = (int) (Math.random() * 8) + 2;
        int sum = 0;

        System.out.println("랜덤 구구단");
        System.out.println("==========================================");
        for (int n = 1; n <= 9; n++) {
            sum = number * n;
            System.out.printf("%d * %d = %d\n", number, n, sum);
        }
    }
}
