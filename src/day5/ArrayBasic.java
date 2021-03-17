package day5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // 1. 배열 변수를 선언
        int[] arr;

        // 2. 배열 객체의 생성
        arr = new int[5];

        //System.out.println("arr = " + arr);

        // 3. 배열 데이터 저장
        arr[0] = 56;
        arr[1] = 22;
        arr[2] = arr[1];
        arr[3] = (int)3.14;
        arr[4] = 100;

        // 4. 배열의 길이를 확인하는 방법
        System.out.println("배열의 길이 :"+arr.length);

        // 5. 배열의 반복문 처리 : fori(단축키)
        int total = 0;
        /*for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }*/

        // 향상된 for 문 : iter(단축키)
        for (int n : arr) {
            total += n;
        }
        System.out.println("total = " + total);

        // 배열 선언 간소화
        double[] dArr = new double[4];

        // 값 목록으로 배열 생성
        // new type 대괄호를 생략할 수 있는 상황은 변수를 선언할 때 뿐이다.
        String[] foods = {"자장", "짬뽕", "탕수육"};

        foods = new String[] {"ss", "aa", "bb"};

        // 배열 내부값 한번에 출력
        // Arrays 라이브러리 사용
        System.out.println(Arrays.toString(foods));
        System.out.println("==========================");

        System.out.println(Arrays.toString(dArr));

        boolean[] bArr = new boolean[6];
        System.out.println(Arrays.toString(bArr));

        String[] sArr = new String[6];
        System.out.println(Arrays.toString(sArr));

        // 배열의 주소 개념
        int[] iArr = {1, 3, 5, 7, 9, 11};
        //int[] copyArr = iArr;
        int[] copyArr = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            copyArr[i] = iArr[i];
        }

        copyArr[0] = 100;
        System.out.println("========================================");
        System.out.println("copyArr = " + Arrays.toString(copyArr));
        System.out.println("iArr = " + Arrays.toString(iArr));


    }
}
