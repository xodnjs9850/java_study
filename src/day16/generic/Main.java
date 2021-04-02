package day16.generic;

public class Main {
    public static void main(String[] args) {
        
        Basket<Apple> ab = new Basket<Apple>();

        ab.setFruit(new Apple());
        Apple fruit = ab.getFruit();
        System.out.println("fruit = " + fruit);
        System.out.println("-------------------------------");

        Basket<Peach> peachBasket = new Basket<Peach>();
        peachBasket.setFruit(new Peach());
        Peach fruit1 = peachBasket.getFruit();
        System.out.println("fruit1 = " + fruit1);
        System.out.println("--------------------------------");

//        Basket<AppleBasket> n = new Basket<AppleBasket>();

        Basket<fruits> fruitsBasket = new Basket<>();
        fruitsBasket.setFruit(new Apple());
        fruitsBasket.setFruit(new Peach());
//        fruitsBasket.setFruit(new AppleBasket());


    }
}
