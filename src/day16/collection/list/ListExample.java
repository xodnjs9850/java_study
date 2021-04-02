package day16.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // 리스트 : 순차형 자료구조, 데이터가 순서대로 저장됨, 중복 저장 가능, 인덱스를 가짐
        List<String> list = new ArrayList<>();

        // 리스트에 객체를 추가 : add()
        list.add("dogs");
        list.add("cats");
        list.add("fight");
        list.add("frog");
        System.out.println(list);

        //리스트에 저장된 객체 수 확인 : size()
        System.out.println(list.size());

        //리스트에 객체 중간 삽입 : add(index, data)
        list.add(2, "tiger");
        System.out.println(list);

        // 리스트 객체 수정 : set(index, newdata)
        list.set(2, "fuck");
        System.out.println(list);

        // 리스트 저장 객체 삭제 : remove(index), remove(obj)
        list.remove(1);
        list.remove("fuck");
        System.out.println(list);

        // 리스트 내부 객체 탐색 : get(index)
        String s = list.get(2);
        System.out.println("s = " + s);

        // 리스트 저장 객체 인덱스 탐색 : indexOf(객체)
        int idx = list.indexOf("dogs");
        System.out.println("idx = " + idx);

        // 리스트에 저장된 객체 유무확인 : contains(obj)
        boolean fight = list.contains("fight");
        System.out.println("fight = " + fight);

        // 리스트의 반복문 처리
        System.out.println("-----------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------------------");
        for (String str : list) {
            System.out.println(str);
        }

        // 리스트 내부 객체 전체 삭제 : clear()
        System.out.println("-------------------------------------");
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        // 2차원 리스트
        List<String[]> list2dV1;
        List<List<String>> list2dV2;

        // 초기값을 가진 리스트
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(100, 50, 60, 90 ,80 ,10)
        );
        System.out.println(numbers);

        // 오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

    }
}
