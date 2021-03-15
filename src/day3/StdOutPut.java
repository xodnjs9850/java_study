package day3;

public class StdOutPut {
    public static void main(String[] args) {
        String cat = "고양이";
        String dog = "강아지";

        System.out.println(cat);
        System.out.println(dog);

        String filePath = "D:\\temp\\new.jpg";
        System.out.println(filePath);

        String msg = "he said \"Warning!\" to me";
        System.out.println(msg);

        int month = 4;
        int day = 5;
        String anni = "식목일";
        System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);

        // %f는 기본적으로 소수점 이하 6자리까지 강제로 표현
        double seleRate = 0.25;
        System.out.printf("할인율은 %.2f입니다.\n", seleRate);
        System.out.printf("할인율은 %.1f입니다.\n", seleRate); // 자동 반올림
        System.out.printf("할인율은 %.2f%%입니다.\n", seleRate);
    }
}
