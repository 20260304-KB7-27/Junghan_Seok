package basic.ch13.sec02.exam01;

public class Application {

    public static void main(String[] args) {

        Product<TV, String> product1 = new Product<>();
        // product1 인스턴스에서 Kind는 타입이 TV

        // 컴파일시점에 타입이 지정되기 때문에
        // Setter의 매개값은 타입에 맞추어 제공되어야함.
        product1.setKind(new TV());
        product1.setModel("스마트TV");

        TV tv = product1.getKind();
        String model = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("스마트TV");

        Car car = product2.getKind();
        String model2 = product2.getModel();



    }
}
