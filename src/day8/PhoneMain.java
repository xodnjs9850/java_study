package day8;

// 실행용 클래스는 main메소드를 포함한다..
public class PhoneMain {
    public static void main(String[] args) {

        // 객체의 생성
        Pone android = new Pone();

        android.powerOn();
        android.showSpec();

        System.out.println("===========================");
        Pone iphone = new Pone("아이폰X");
        iphone.showSpec();

        System.out.println("===========================");
        Pone LgV6 = new Pone("LgV6", "에메랄드 그린");
        LgV6.showSpec();

        System.out.println("===========================");
        android.powerOff();
        iphone.powerOff();

        android.powerOn();
        iphone.powerOn();
        android.sendMessage(iphone, "저녁이나 먹자");
        iphone.checkMessages();

        iphone.sendMessage(android, "삼겹살 ㄱㄱ");
        android.checkMessages();

        android.sendMessage(iphone, "vwsefsadf");
        android.sendMessage(iphone, "efwqwwwwwwwwwww ");
        android.sendMessage(iphone, "vmlr vew oflds ;lw ");
        android.sendMessage(iphone, "vmlr vew oflds ;lw ");
        android.sendMessage(iphone, "vmlr vwdwrrrrrrrrrrrrr");
        iphone.checkMessages();

        // git error
        /*Pone iphone = new Pone();

        // 객체의 속성과 기능을 참조 : 참조연산자 . 을 사용
        android.model = "갤럭시 S20";
        android.color = "펄 블루";
        android.price = 10000000;

        iphone.model = "아이폰 X";
        iphone.color = "스노우 화이트";
        iphone.price = 20000000;

        android.powerOn();
        android.showSpec();

        iphone.powerOn();
        iphone.showSpec();
        iphone.powerOff();
*/
    }
}
