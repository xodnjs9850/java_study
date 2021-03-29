package day12.poly.car;

public class Driver {

    void drive(Car s) {
        System.out.println("운전을 시작");
        s.run();
    }

    Car buyCar(String carName) {
        if (carName.equals("투싼")) {
            System.out.println("투싼 구매");
            return new Tucson();
        } else if (carName.equals("소나타")) {
            System.out.println("소나타 구매");
            return new Sonata();
        } else if (carName.equals("박스터")){
            System.out.println("박스터 구매");
            return new Boxter();
        } else {
            System.out.println("없어");
        }
        return null;
    }
}
