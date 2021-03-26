package day11.static_;

public class Main {

    public static void main(String[] args) {
        Count c1 = new Count();
        c1.x = 5;
        Count.y = 10;

        Count c2 = new Count();
        c2.x += 10;
        Count.y += 10;

        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);
        System.out.println("c1.y = " + Count.y);
        System.out.println("c2.y = " + Count.y);

        Count.method2(c1);
        Count.method2(c2);

        Calculator.calcAreaCircle(5);
    }
}
