package lecture.lambda.section03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Application2 {
    /*

     */
    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();
        subjects.add("JAVA");
        subjects.add("PHP");
        subjects.add("C#");
        subjects.add("C++");
        subjects.add("Python");

        Function<String, Account> function = (name) -> new Account(name);
        Account account = function.apply("홍길동");

        List<Account> accounts = subjects.stream()
                .map(Account::new) // String -> Account 생성자 호출 (생성자 참조)
                .toList(); // List 형태로 반환해주는 역할

        System.out.println("account = " + accounts);

    }
}
