package basic.ch13.sec01;

public class Application2 {

    // T가 Integer로만 타입 제한
    public static <T extends Integer> Box<T> boxing(T content) {
        Box<T> box = new Box<>();
        box.setContent(content);
        return box;
    }

    // 오버로딩
    public static <T extends String> Box<T> boxing(T content) {
        Box<T> box = new Box<>();
        box.setContent(content);
        return box;
    }

    public static void main(String[] args) {

        // 정수형
        Box<Integer> box1 = boxing(100);
        int intValue = box1.getContent();
        System.out.println("intValue = " + intValue);

        // 문자열
        Box<String> box2 = boxing("bear");
        String strValue = box2.getContent();
        System.out.println("strValue = " + strValue);

    }
}
