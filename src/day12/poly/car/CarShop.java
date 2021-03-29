package day12.poly.car;

public class CarShop {

    int sellCar(Car c) {
        if (c instanceof Sonata) {
            System.out.println("네고없이 천만원");
            return 1000;
        } else if (c instanceof Tucson) {
            System.out.println("1300 어때?");
            return 1300;
        } else if (c instanceof Boxter) {
            System.out.println("5000에 가자");
            return 5000;
        } else {
            System.out.println("안사!");
            return 0;
        }
    }

}
