package day4;

public class LoopNesting {
    public static void main(String[] args) {

        for (int i = 2; i <=9 ; i++) {
            for (int y = 1; y <= 9 ; y++) {
                System.out.printf("%d * %d = %d\n", i, y, i*y);
            }
        System.out.println("---------------------------------------");
        }
    }
}
