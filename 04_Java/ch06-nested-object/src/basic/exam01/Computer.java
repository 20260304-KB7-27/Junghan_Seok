package basic.exam01;

/*
 * 시나리오. 내 컴퓨터의 CPU
 * 컴퓨터의 전원 유무에 따른 CPU의 연산 동작
 * 컴퓨터 객체의 상태(전원 유무)에 따라 CPU의 '연산'아리는 동작이 종속되는 상황*/
public class Computer {
    // 필드 (전원 유무)
    private boolean isPowerOn = false;

    // 메소드 (전원 켜는 메소드)
    public void powerOn() {
        this.isPowerOn = true;
    }

    // 인스턴스 내부 클래스 => 외부 클래스의 멤버 접근 가능 !! (private도 포함)
    class CPU {
        void process() {
            // 컴퓨터의 전원 유무(외부클래스의 멤버)에 따라 다른 동작
            if(isPowerOn) {
                System.out.println("연산을 시작합니다.");
            } else {
                System.out.println("전원이 꺼져있어 연산을 할 수 없습니다.");
            }
        }
    }

    /*
     * CPU 클래스를 따로 분리했을 경우 (독립적으로 두었을 경우)
     * => 외부에서 해당 컴퓨터객체의 isPowerOn 멤버를 접근할 수 있도록 getter용 메소드 만들어야 함
     * => 어차피 CPU가 Computer에서만 사용될 경우 내부 클래스로 둬서 코드의 응집도를 높임
     * */

}
