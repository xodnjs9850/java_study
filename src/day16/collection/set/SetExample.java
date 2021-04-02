package day16.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        // Set : 중복 저장 허용 X, 순서없이 빠른속도로 저장, 전체탐색속도 빠름
        Set<String> set = new HashSet<>();

        // set에 객체 추가
        set.add("김말이");
        set.add("닭강정");
        set.add("김밥");
        set.add("떡볶이");
        set.add("김말이");

        System.out.println(set.size());
        System.out.println("set = " + set);

        // set의 반복문 처리
        System.out.println("--------------------------------------------");
        for (String str : set) {
            System.out.println(str);
        }

        // set의 객체 삭제
        set.remove("김말이");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());

    }
}
