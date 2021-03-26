package day10.inherrit.player;

// 공통 속성과 기능을 가진 클래스를 부모, 상위 클래스(super class)라고 함
public class Player {

    // 공통 필드
    private String nickName;
    int level;
    int hp;

    // 생성자
    public Player(String nickName) {
//        System.out.println("Player 생성자 호출");
        this.nickName = nickName;
        this.level = 1;
        this.hp = level * 50;
    }

    // 공통 메소드
    void attack() {
        System.out.printf("%s님이 공격합니다.\n", this.nickName);
    }

    public void info() {
        System.out.println("=======================================");
        System.out.println("# 내 캐릭터명 : " + nickName);
        System.out.println("# 레벨 : " + level);
        System.out.println("# 체력 : " + hp);
    }

    public String getNickName() {
        return nickName;
    }
}
