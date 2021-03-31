package day14.lang.system;

public class SystemTime {

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        System.out.println("now = " + now);

        //알고리즘 시간적합도 계산
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {

        }

        long end = System.currentTimeMillis();

        System.out.println("실행시간 : " + (end - start) + "ms");

    }

}
