package day9.player;

public class Main {
    public static void main(String[] args) {

        Player kim = new Player("김철수", 20);
        System.out.println("======================================");
        Player pack = new Player("박영희");
        System.out.println("======================================");
        Player hong = new Player();

        /*System.out.println("kim의 주소값 : " + kim);
        System.out.println("pack의 주소값 : " + pack);

        kim.attack(pack);

        kim.attack(new Player("홍길동"));*/

        kim.info();
        System.out.println("======================================");
        pack.info();
        System.out.println("======================================");
        hong.info();
    }
}
