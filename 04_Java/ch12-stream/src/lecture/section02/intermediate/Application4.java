package lecture.section02.intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {

        List<Integer> integerList = IntStream.of(1,5,6,7,12,5,3)
                .boxed() // IntStream -> Stream<Integer>
                .sorted() // 기본정렬 -> 오름차순, Comparator 사용가능
                .toList();

        System.out.println("integerList = " + integerList);

    }
}