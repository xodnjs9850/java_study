package day10.encap;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("야옹이");
//        myCat.weight = -2000;

        myCat.setWeight(7.88);
        myCat.printWeight();

        double tripleWeight = myCat.getWeight(true) * 3;
        System.out.println("tripleWeight = " + tripleWeight);
    }
}
