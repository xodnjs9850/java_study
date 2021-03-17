package day5;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int newData = 40;
        int[] copy = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        copy[copy.length - 1] = newData;

        arr = copy;
        copy = null;
        System.out.println(Arrays.toString(arr));
    }
}
