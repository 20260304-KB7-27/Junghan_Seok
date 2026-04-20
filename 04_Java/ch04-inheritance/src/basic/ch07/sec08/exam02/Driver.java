package basic.ch07.sec08.exam02;

public class Driver {

    // 매서드 -> 의존 관계
    // 개방 폐쇄 법칙
    // 확장에는 열려있고, 수정에는 닫혀있음.
    public void drive(Vehicle vehicle){
        vehicle.run();

    }
}
