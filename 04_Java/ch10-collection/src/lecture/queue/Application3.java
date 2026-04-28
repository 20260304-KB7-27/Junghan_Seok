package lecture.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application3 {

    public static void main(String[] args) {

        /*
         * PriorityQueue 우선순위 큐
         * - FIFO 이아니라 우선순위가 높은 요소부터 꺼냄
         * - Comparable, Compartor 정렬 기준을 변경 할 수 있음 (우선순위 지정가능)
         * */

        // 숫자형 기본 : 오름차순
        // Collections.reverseOrder() : 기본정렬의 역순 Comparator
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);
        pq.offer(40);

        System.out.println("pq = " + pq); // 정렬순서는 아님 메모리상 구조

        // 작은숫자부터 꺼냄 (우선순위기준)
        while(!pq.isEmpty()) {
            System.out.println("pq.poll() = " + pq.poll());
        }
    }
}
