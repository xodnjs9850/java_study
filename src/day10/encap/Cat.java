package day10.encap;

public class Cat {

    private String name;
    private double weight;

    public Cat(String name) {
        this.name = name;
    }

    // 값을 가져가서 참조하고 싶을때는 getter 이용
    public double getWeight(boolean pound) {
        if (pound) {
            return this.weight * 0.45; // pound 표기로 반환
        }
        return this.weight; // kg 표기로 반환
    }

    // 값을 변경하거나 초기화하고 싶으면 setter를 이용
    public void setWeight(double weight) {
        if (weight <= 0 || weight >= 20) {
            this.weight = 3.5;
            return;
        }
        this.weight = weight;
    }

    public void printWeight() {
        System.out.printf("%s의 몸무게는 %.2f입니다.\n", this.name, this.weight);
    }

}
