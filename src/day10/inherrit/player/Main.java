package day10.inherrit.player;

public class Main {
    public static void main(String[] args) {

        Warrior w = new Warrior("전사킹");
        Mage m = new Mage("대마법사");
        Hunter h = new Hunter("고양이");

        w.info();
        m.info();
        h.info();

    }
}
