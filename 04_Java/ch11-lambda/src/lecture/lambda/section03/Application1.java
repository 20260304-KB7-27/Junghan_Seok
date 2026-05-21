package lecture.lambda.section03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Application1 {
    public static void main(String[] args) {
        /*
        메서드 참조
        - 함수형 인터페이스를 람다식이 아닌 일반 메서드를 참조시켜서 선언하는 방법
        - 람다식 대신에 이미 만들어져있는 메서드를 연결해서 쓰는 방법

        - 클래스 이름 :: 메서드 이름
        - 참조 변수 :: 메서드 이름
         */

        List<String> subjects = new ArrayList<>();
        subjects.add("JAVA");
        subjects.add("PHP");
        subjects.add("C#");
        subjects.add("C++");
        subjects.add("Python");
        /*
        일반 메서드를 참조할 때
        - 함수형 인터페이스의 매개 변수 타입/갯수/반환형과
        - 일반 메서드의 매개 변수 타입/갯수/반환형이 같아야 함.
        */
        Function<String, String> function = (str)->str.toUpperCase();
        Consumer<String> consumer = (str)->System.out.println(str);

        subjects.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
