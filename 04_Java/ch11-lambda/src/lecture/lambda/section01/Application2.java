package lecture.lambda.section01;

public class Application2 {
    public static void main(String[] args) {
        OuterCalculator.Sum sum = (int x, int y) -> x + y;
        OuterCalculator.Minus minus = (int x, int y) -> x-y;
        OuterCalculator.Divide divide = (int x, int y) -> x/y;


    }
}
