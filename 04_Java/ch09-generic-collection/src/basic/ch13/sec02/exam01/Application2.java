package basic.ch13.sec02.exam01;

public class Application2 {

    public static void main(String[] args) {
        CarAgency car = new CarAgency();
        TVAgency tv = new TVAgency();

        createObject(car);
        createObject(tv);

    }

    public static void createObject (Rentable rentable) {

        rentable.rent();
    }


}
