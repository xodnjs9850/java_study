package day5;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // 배열의 끝 데이터 삭제(pop)
        int[] arr = {1, 2, 3, 4, 5};
        int[] temp = new int[arr.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;
        System.out.println(Arrays.toString(arr));

        // 배열 중간 요소 삭제 : 삭제할 배열 인덱스 뒤의 인덱스를 한 칸씩 땡김

    }
}
