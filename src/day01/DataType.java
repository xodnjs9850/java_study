package day01;

public class DataType {
    public static void main(String[] args) {
        byte a = 50;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483648L;
        System.out.println("d = " + d);

        float f1 = 3.71252365736262626F;
        double d1 = 3.7325740346535353535353539;
        System.out.println(f1);
        System.out.println(d1);

        boolean t = true;
        boolean f = false;
    /*
      boolean error = 0;
      boolean error2 = null;
      boolean error3 = "true";
      boolean error4 = True;
    */

        char c1 = 'A';
        String s1 = "adadaadd";
        String s2 = "A";

        System.out.println("100" + "200");
        System.out.println(100 + "200"); // 숫자와 문자열의 덧셈만 문자열 변환처리
//        System.out.println("200" - 100);

        System.out.println(10 + 10.5);
    }
}
