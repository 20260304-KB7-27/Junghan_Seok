package advanced.ch08.sec11.exam01;

public class Car {
    // 타이어
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run() {
        tire1.roll();
        tire2.roll();
    }
}