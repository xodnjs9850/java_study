package day10.inherrit.player;

public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName);
//        this.nickName = nickName;
        this.mana = 100;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 마력 : " + mana);
    }

    /* void mateo() {

     *//*# 공식 : X 이상 Y 이하의 랜덤 정수
            (int) (Math.random() * (y - x + 1)) + x;*//*

//        int damage = (int)(Math.random() * 15) + 1;

    }*/

    public void meteo(Player... players) {

        if (players.length > 0) {

            System.out.println();
            System.out.println("*******************************");
            System.out.printf("%s님이 메테오 시전!\n", this.getNickName());
            System.out.println("*******************************");

            for (int i = 0; i < players.length; i++) {
                if (players[i] == this) continue;

                int damage = (int) (Math.random() * 6) + 10;
                players[i].hp = players[i].hp - damage;

                if (players[i].hp <= 0) {
                    System.out.printf("%s님이 %s님에 의해 사망하였습니다.\n",
                            players[i].getNickName(), this.getNickName());
                    continue;
                } else {
                    System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력 : %d)\n",
                            players[i].getNickName(), damage, players[i].hp);
                }
            }
        } else {
            System.out.println("타겟된 플레이어가 없습니다.");
        }


    }

}
