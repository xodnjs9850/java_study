package day11.final_;

class  Child extends Prent {

    Prent p = new Prent();
    @Override
//    void m1() {
    void m2() {
    m1();
    }
}

//public final class Prent {
public class Prent {

    final void m1() {}
    void m2() {}

}
