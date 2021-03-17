package day5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        String[] foods = {"치킨", "피자", "삼겹살", "족발"};
        Scanner sc = new Scanner(System.in);

        System.out.print("찾을 음식 : ");
        String targetFood = sc.next();

        // 순차 탐색 알고리즘
        boolean containFood = false;
        int i;

        for (i = 0; i < foods.length; i++) {
            if (targetFood.equals(foods[i])) {
                containFood = true;
                break;
            }
        }

        if (containFood) {
            System.out.println("해당 음식이 존재합니다.");
            System.out.println("찾은 음식의 인덱스 : " + i);

            System.out.print("새로운 음식명 : ");
            foods[i] = sc.next();

            System.out.println("수정 후 음식 : " + Arrays.toString(foods));

        } else {
            System.out.println("해당 음식이 존재하지 않습니다.");
        }

    }
}
