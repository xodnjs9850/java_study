package day01;

public class Variable {
    public static void main(String[] args) {
        // 변수 선언
        int number = 20;
//        int point = 3.14; 타입 에러
        number = 70;
        System.out.println("number = " + number);

        int tripleNumber = number * 3;
        System.out.println("tripleNumber = " + tripleNumber);
        
        String name = "kimtaewon";
        System.out.println("name = " + name);

        // 변수의 범위 : 변수는 선언된 블록을 벗어나면 메모리에서 제거된다.
        int n1 = 1, n2 = 2;

        if (true) {
            int n3 = n1 + n2;
        } // end if
//        System.out.println("n3 = " + n3); n3를 참조불가!
    } //end main
} //end class
