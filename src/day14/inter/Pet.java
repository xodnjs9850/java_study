package day14.inter;

public interface Pet {

    // 인터페이스는 모든 필드를 상수로 처리
    // name의 값은 변경 불가
    // public static final은 자동으로 붙임
    String name = "dd";

    // 인터페이스는 모든 메서드를 추상화한다.
    public void play();

}
