package day3;

public class LogicalOperlator {
    public static void main(String[] args) {
        int x = 10, y = 20;

        boolean result1 = (x != 10) && (++y == 21);
        boolean result2 = (x == 10) || (++y == 22);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("y = " + y);


    }
}
