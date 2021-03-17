package day5;

import java.util.*;

public class ArrayInsertQuiz {
    public static void main(String[] args) {

        System.out.println("#먹고 싶은 음식을 입력하세요.");
        System.out.println("#입력을 중지하려면 <그만>을 입력하세요.");
        Scanner sc = new Scanner(System.in);

        String[] foods = {};

        while (true) {
            System.out.print("> ");
            String foodName = sc.nextLine();
            if (foodName.equals("그만")){
                System.out.println("입력 종료!");
                System.out.println("먹고 싶은 음식들 : " + Arrays.toString(foods));
                sc.close();
                break;
            } else {
                String[] copy = new String[foods.length + 1];

                for (int i = 0; i < foods.length; i++) {
                    copy[i] = foods[i];
                }
                copy[copy.length - 1] = foodName;
                foods = copy;
                copy = null;
            }

        }



    }
}
