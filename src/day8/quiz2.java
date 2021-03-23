package day8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class quiz2 {

    static double[] calcArrayTotal(int... numbers) {

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        double average = (double) total / numbers.length;

        return new double[]{total, average};
    }

    public static void main(String[] args) {
        int[] numbers = {57, 89, 78, 91, 93, 47};
        double[] arrTotAvg = calcArrayTotal(numbers);
        System.out.printf("총점 : %d점, 평균 : %.2f점\n", (int)arrTotAvg[0], arrTotAvg[1]);
    }
}
