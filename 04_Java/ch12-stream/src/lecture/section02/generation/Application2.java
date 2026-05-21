package lecture.section02.generation;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {

        /*
         * range(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자들 범위 (종료값 전까지)의 스트림을 생성
         * rangeClosed(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자들 범위 (종료값 포함)의 스트림을 생성
         * */
        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(i -> System.out.print(i + " "));

        System.out.println();
        IntStream intStream2 = IntStream.rangeClosed(5, 10);
        intStream2.forEach(i -> System.out.print(i + " "));


        // doubles(갯수) : 난수를 갯수만큼 스트림을 만들어 반환
        // boxed(): 기본타입 스트림을 박싱하여 Stream<타입> 으로 변환

        Stream<Double> doubleStream = new Random().doubles(5).boxed();
//        DoubleStream doubleStream2 = new Random().doubles(5);


    }
}