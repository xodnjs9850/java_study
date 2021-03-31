package day14.exception;

public class FinallyEx {
    public static void main(String[] args) {

        String[] pets = {"비둘기", "소라게", "거북이"};
        for (int i = 0; i < 4; i++) {

            try {
                System.out.println(pets[i] + " 키울래요");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("애완동물 데이터가 없습니다.");
            } finally {
                // 보통 메모리 해제 코드를 넣는다.(DB, Network, File)
                System.out.println("애완 동물을 사랑합시다");
            }
        }
        System.out.println("프로그램 정상 종료");

    }
}
