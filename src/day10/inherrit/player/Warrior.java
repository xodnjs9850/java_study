package day10.inherrit.player;

// 상위 클래스로부터 상속받은 클래스를 자식, 하위 클래스(sub class)라고 함
// 상속은 is-a 관계를 만족
public class Warrior extends Player {

    int rage;

    public Warrior(String nickName) {
        super(nickName);
//        this.nickName = nickName;
        this.rage = 60;
    }

    @Override // 오버 라이딩 룰을 위반했는지 확인
    public void info() {
        super.info();
        System.out.println("# 분노 게이지 : " + rage);
    }

    void fireSlash() {

    }

}
