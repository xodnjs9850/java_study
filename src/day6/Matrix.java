package day6;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int[][] arr2d = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        System.out.println(arr2d.length);

        System.out.println(Arrays.toString(arr2d[1]));

        int[] temp = arr2d[2];
        System.out.println(arr2d[2][0]);

        int number = arr2d[2][2];
        System.out.println("number = " + number);

        arr2d[1][1] = 0;
        arr2d[2] = new int[] {2, 53, 543, 11, 33};

        for (int[] i : arr2d) {
            for (int y : i) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr2d));
        System.out.println(arr2d[1]);

        // 배열 생성문으로 배열 생성
        int[][] textArr = new int[3][2];

        // 3차원 배열
        int[][][] arr3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                },
                {
                        {13, 14, 15},
                        {16, 17, 18}
                }
        };

        System.out.println("====================");
        System.out.println(arr3d[2][0][2]);

    }
}
