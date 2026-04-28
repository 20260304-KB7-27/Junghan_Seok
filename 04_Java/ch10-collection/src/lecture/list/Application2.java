package lecture.list;

import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {

        /*
         * Stack
         * - 선형 메모리 공간에 데이터를 저장하며 후입 선출(LIFO) 방식의 자료구조
         * */

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        // peek() : 가장 상단(마지막에 들어온) 요소 반환
        // pop() : 가장 상단(마지막에 들어온) 요소 반환 후 제거
//        System.out.println("integerStack.peek() = " + integerStack.peek());
//        System.out.println("integerStack.pop() = " + integerStack.pop());
//        System.out.println("integerStack.peek() = " + integerStack.peek());


        // search() : 요소 찾기 위에서부터의 순번을 의미 (1부터시작)
        System.out.println("integerStack.search(3) = " + integerStack.search(3));


        // 다 비어 있을때는 예외 발생  EmptyStackException
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());


    }
}
