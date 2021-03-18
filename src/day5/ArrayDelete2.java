package day5;

import java.util.Arrays;

public class ArrayDelete2 {
    public static void main(String[] args) {

        // 배열 중간 요소 삭제 : 삭제할 배열 인덱스 뒤의 인덱스를 한 칸씩 땡김
        int[] arr = {1, 3, 5, 7, 9, 11, 13};

        System.out.println("삭제 전 데이터 : " + Arrays.toString(arr));

        int deleteData = 2;

        for (int i = deleteData; i < arr.length - 1; i++) {
           arr[i] = arr[i+1];
        }

        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++){
            temp[i] = arr[i];
        }
        arr = null;

        System.out.println("삭제 후 데이터 : " + Arrays.toString(temp));

    }
}
