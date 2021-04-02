package day16.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MapExample {
    public static void main(String[] args) {

        // Map: key, value의 쌍으로 데이터를 집합관리, key는 중복 불가능, value는 중복 가능
        Map<String, Member> memberMap = new HashMap<>();

        // map에 객체 추가 : put(key, value)
        memberMap.put("dog", new Member("kim", 34));
        memberMap.put("cat", new Member("pack", 24));
        memberMap.put("mouse", new Member("lee", 16));
        System.out.println(memberMap);

        // 이미 저장된 key로 새롭게 put하면 value가 수정됨
        memberMap.put("cat", new Member("dooli", 7));
        System.out.println(memberMap);

        System.out.println(memberMap.size());

        //map에 저장된 객체 참조 : get(key)
        Member kim = memberMap.get("dog");
        System.out.println("kim = " + kim);
        System.out.println(kim.name);

        // map에 저장된 key위 유무 확인
        System.out.println(memberMap.containsKey("cat"));
        System.out.println(memberMap.containsKey("mouse"));

        // map에 저장된 내부 객체 삭제
        memberMap.remove("cat");
        System.out.println(memberMap);
        System.out.println("--------------------------------------");

        // map의 반복문 처리
        // map은 keySet() 메서드를 지원한다. 저장된 key만 추출하여 Set 컬렉션에 담아 리턴
        Set<String> keys = memberMap.keySet();
        System.out.println("keys = " + keys);

        for (String key : keys) {
            System.out.println(memberMap.get(key));
        }

    }
}
