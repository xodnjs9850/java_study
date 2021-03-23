package day8;

// 설계도 클래스는 main을 만들지 않는다.
public class Pone {
    // 속성 : 객체의 데이터
    //필드
    String model;
    String color;
    int price;
    String[] recieveMessages;
    int messageCount;
    boolean isOn;

    // 생성자 선언
    // 객체의 초기화를 담당함
    Pone() {
        model = "갤럭시 S20";
        color = "블랙";
        price = 10000000;
        recieveMessages = new String[3];
        isOn = true;
    }

    Pone(String customModel) {
        model = customModel;
        color = "스노우 화이트";
        price = 12000000;
        recieveMessages = new String[5];
        isOn = true;
    }

    Pone(String customModel, String customColor) {
        model = customModel;
        color = customColor;
        price = 15000000;
        recieveMessages = new String[10];
        isOn = true;
    }

    // 기능 : 객체의 행위
    //메소드 : static을 붙이지 않음

    // 전원을 켜는 기능
    void powerOn() {
        isOn = true;
        System.out.println("\n" + model + "의 전원을 켭니다.");
    }

    //전원을 끄는 기능
    void powerOff() {
        isOn = false;
        System.out.println("\n" + model + "의 전원을 끕니다.");
    }

    // 핸드폰 정보를 보여주는 기능
    void showSpec() {
        if (!isOn) {
            System.out.println("전원을 먼저 켜세요.");
            return;
        }
        System.out.println("\n*** 휴대폰의 정보 ***");
        System.out.println("# 모델명 : " + model);
        System.out.println("# 색상 : " + color);
        System.out.println("# 가격 : " + price + "원");
    }

    //문자를 보내는 기능
    void sendMessage(Pone targetPhone, String message) {
        if (!isOn) {
            System.out.printf("%s의 전원을 먼저 켜세요.\n", model);
            return;
        }

        if (!targetPhone.isOn) {
            System.out.printf("%s의 전원이 꺼져있습니다.\n", targetPhone.model);
            return;
        }

        if (targetPhone.messageCount < targetPhone.recieveMessages.length) {
            targetPhone.recieveMessages[targetPhone.messageCount++] = message;
            System.out.println("메시지를 성공적으로 보냈습니다.");
        } else {
            System.out.println("상대방의 메시지함이 다 찼습니다.");
        }
    }

    void checkMessages() {
        System.out.printf("======= %s의 메시지함 =======\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i + 1, recieveMessages[i]);
        }
    }
}
