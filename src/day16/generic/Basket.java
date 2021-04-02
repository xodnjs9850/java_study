package day16.generic;

// 제네릭 타입 F
public class Basket<F extends fruits> {

    // 과일 필드
    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
