package basic.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }


        int i = 1;   // 초기값 설정 (카운터 변수)

        // i가 100이 될 때까지 반복
        while (i <= 100) {
            sum += i; // sum = sum + i;
            i++;      // 증감식 (이게 없으면 무한 루프에 빠져요!)
        }

        System.out.println("1~100 합 : " + sum);

    }
}