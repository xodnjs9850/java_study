package day9.modi.member.pac1;

public class D {
    public int f1;
    int f2; // Default
    private int f3;

    public void m1 (){}
    void m2 (){} // Default
    private void m3 (){}

    public D () {
        f1 = 1; f2 = 2; f3 = 3;
        m1(); m2(); m3();
    }
}
