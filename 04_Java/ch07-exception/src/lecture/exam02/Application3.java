package lecture.exam02;

public class Application3 {

    public static void main(String[] args) {

        // 상황.
        // 사용자입력문자열 => 숫자로 치환 => 배열 생성 => 특정 인덱스 출력

        String inputSize = "10";
        int inputIndex = 5;

        int size = Integer.parseInt(inputSize);
        int[] arr = new int[size];
        System.out.println(arr[inputIndex]);

        System.out.println("프로그램 종료");


    }


    /*
        Unchecked Exception (실행 예외)
        1. 컴파일 에러가 뜨지 않음
        2. 예외 처리 코드가 필수가 아님
            => 즉, 예외 처리 코드를 필수로 작성하지 않아도 프로그램 동작 가능
        3. 예측 가능한 상황 => 조건문으로도 핸들링 가능
        4. RuntimeException 계층
     */

}
