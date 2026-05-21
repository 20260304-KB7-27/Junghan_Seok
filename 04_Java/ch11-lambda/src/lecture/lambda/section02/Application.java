package lecture.lambda.section02;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {
        /*
        Runnable : 매개 변수 X, 리턴값 X : run()
        Consumer : 매개 변수 O, 리턴값 X : accept()
        Supplier : 매개 변수 X, 리턴값 O : getXXX()
        Function : 매개 변수 O, 리턴값 O : apply()
        Operator : 매개 변수 O, 리턴값 O : apply() * 매개 변수와 리턴 타입이 동일
        Predicate : 매개 변수 O, 리턴값 O : test() * Boolean 값을 리턴
         */
        BinaryOperator<Integer> binaryOperator = Integer::sum;

        System.out.println(binaryOperator.apply(1, 5));

        Runnable runnable = () -> System.out.println("runnable 실행"  );

        Consumer<String> consumer = System.out::println;
        consumer.accept("hello");

        Supplier<LocalDateTime> supplier = LocalDateTime::now;
        System.out.println(supplier.get());

        Function<String, Integer> function = (str1) -> Integer.parseInt(str1);
        String str = "12345";

        System.out.println(function.apply(str));

        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        System.out.println(isEven.test(5));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> numbers2 = numbers.stream()
                                .filter(isEven)
                                .toList();

    }
}
