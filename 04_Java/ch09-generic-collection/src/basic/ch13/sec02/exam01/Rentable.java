package basic.ch13.sec02.exam01;

public interface Rentable<P> {

    // P라는 반환타입으로 rent 추상메서드 생성
    P rent();
}
