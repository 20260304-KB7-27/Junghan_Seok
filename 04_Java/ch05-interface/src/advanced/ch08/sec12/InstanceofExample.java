package advanced.ch08.sec12;

import javax.swing.plaf.basic.BasicOptionPaneUI;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);

    }

    public static void ride(Vehicle vehicle){ // 매개변수의 다형성

        // 전달된 vehicle의 실제 객체가 버스라면 checkFare 메소드 실행
        // 방법1. instanceof로 타입 체크 후 다운캐스팅으로 메소드 실행
        /*
        if(vehicle instanceof Bus){
            Bus bus = (Bus)vehicle;
            bus.checkFare();
        }
         */

        // 방법2. instanceof 패턴 매칭 (jdk 12 등장)
        if(vehicle instanceof Bus bus){
            //Bus bus = (Bus)vehicle; // 생략 가능
            bus.checkFare();
        }

        vehicle.run();

    }
}