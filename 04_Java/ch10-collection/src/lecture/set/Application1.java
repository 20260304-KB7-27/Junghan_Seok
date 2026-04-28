package lecture.set;

import java.util.HashSet;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /*
         * HashSet
         * - Set 인터페이스 대표 구현체
         * - 해시기반으로 동작 -> 검색속도가 빠르다
         * - 순서가 없음.
         * - 중복 X
         * */

        Set<String> hset = new HashSet<>();

        hset.add("java");
        hset.add("mysql");
        hset.add("jdbc");
        hset.add("vue");
        hset.add("js");

        // 순서 유지 안됨
        System.out.println("hset = " + hset);

        boolean added = hset.add("js"); // 중복이기때문에 추가 안됨.
        System.out.println("added = " + added);
        System.out.println("hset = " + hset);

        // set으로 반복
        for (String str : hset) {
            System.out.println("str = " + str);
        }

    }
}
