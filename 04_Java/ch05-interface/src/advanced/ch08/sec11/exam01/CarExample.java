package advanced.ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run(); // 현재 Car객체의 두 타이어(한국타이어)의 roll메소드 실행

        // 금호타이어로 타이어 교체
        // Tire 타입
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run(); // 현재 Car객체의 두 타이어(금호타이어)의 roll메소드 실행
    }
}