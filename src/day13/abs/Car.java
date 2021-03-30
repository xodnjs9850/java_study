package day13.abs;

// 추상 클래스
public abstract class Car {

    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
        System.out.println("aaa");
    }

    // 추상 메서드
    public abstract void start(); // 주행 기능 명세

    public static void staticMet() {}
    public void instanceMet() {}
    public final void finalMet() {}

}
