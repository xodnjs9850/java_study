package day15.api.lang.wrapper;

public class Basic {

    public int x; // 기본값 0
    public Integer y; // 기본값 NULL

    public static void main(String[] args) {

        // Byte, Short, Integer, Long, Float, Double, Boolean, Character

        int a = 10;
        // 래핑 : boxing
        Integer i = new Integer(a);

        // auto boxing
        Integer j = 100;
        int z = 200;
        Object[] oArr = {10, 3.3, "add", true, z};

        Basic b = new Basic();
//        System.out.println(b.x + b.y);

        // 문자열 변환 기능
        try {
            String s1 = "90";
            String s2 = "5.11";
            int n1 = Integer.parseInt(s1);
            double n2 = Double.parseDouble(s2);
            System.out.println(n1 + n2);
        } catch (Exception e) {
            System.out.println("변환할 수 없는 문자열입니다.");
        }
    }

}
