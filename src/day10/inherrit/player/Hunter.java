package day10.inherrit.player;

public class Hunter extends Player {

    String beast;

    public Hunter(String nickName) {
        super(nickName);
//        this.nickName = nickName;
        this.beast = "야옹이";
    }

    @Override
    void info() {
        super.info();
        System.out.println("# 동물 : " + beast);
    }

    void frozenShot() {

    }

}
