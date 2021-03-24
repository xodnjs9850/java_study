package day9.compare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        student kim1 = new student("김철수");

        System.out.println("이름 : ");
        String inputName = sc.next();

        System.out.println("inputName = " + inputName);
        student kim2 = new student("김철수");

        System.out.println(kim1.name == inputName);
        System.out.println(kim1.name.equals(inputName));

    }
}
