package lecture.lambda.section01;

public class OuterCalculator {
    @ FunctionalInterface
    interface Sum{
        int sum(int a, int b);
    }

    @ FunctionalInterface
    interface Minus{
        int minus(int a, int b);

    }

    @FunctionalInterface
    interface Divide{
        int divide(int a, int b);
    }



}
