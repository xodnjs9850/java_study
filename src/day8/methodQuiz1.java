package day8;

import java.util.Arrays;

public class methodQuiz1 {

    static int calcDivizor(int number) {

        int total = 0;
        for (int n = 1; n <= number; n++) {
            if (number % n == 0) {
                total += n;
            }
        }

//        System.out.println(total);
        return total;

    }

    public static void main(String[] args) {
        System.out.println("10의 약수의 총합 : " + calcDivizor(10));
        System.out.println("---------------------------------------------------");
        System.out.println("30의 약수의 총합 : " + calcDivizor(30));
    }
}
