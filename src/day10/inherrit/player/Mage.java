package day10.inherrit.player;

public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName);
//        this.nickName = nickName;
        this.mana = 100;
    }

    @Override
    void info() {
        super.info();
        System.out.println("# 마력 : " + mana);
    }

    void mateo() {

    }

}
