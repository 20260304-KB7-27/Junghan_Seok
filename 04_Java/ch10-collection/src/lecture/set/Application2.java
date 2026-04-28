package lecture.set;

import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {

        /*
         * TreeSet
         * - 이진 탐색 트리 기반의 set 구현체
         * - 요소들이 자동으로 오름차순 정렬됨.
         * */

        TreeSet<Integer> tset = new TreeSet<>();

        tset.add(30);
        tset.add(10);
        tset.add(50);
        tset.add(20);
        tset.add(40);
        tset.add(10); // 중복 -> 무시
        System.out.println("tset = " + tset); // 정렬됨


        System.out.println("tset.first() = " + tset.first()); // 가장 작은 요소
        System.out.println("tset.last() = " + tset.last()); // 가장 큰 요소


        /*
         * ceiling(e) : e 이상인 요소 중 가장 작은값
         * higher(e) : e 초과인 요소 중 가장 작은값
         * */
        System.out.println("tset.floor(25) = " + tset.floor(25)); // 25 이하인 요소중 가장 큰값
        System.out.println("tset.lower(25) = " + tset.lower(20)); // 25 미만인 요소중 가장 큰값

        /*
         * headset(e) : e 미만인 요소들로 구성된 set 반환
         * tailSet(e) :  e 이상인 요소들로 구성된 set 반환
         * subSet(from, to) : from 이상 to 미만 요소들로 구성된 set 반환
         * */
        System.out.println("tset.headSet(30) = " + tset.headSet(30));
        System.out.println("tset.tailSet(30) = " + tset.tailSet(30));
        System.out.println("tset.subSet(20,40) = " + tset.subSet(20,40));

    }
}
