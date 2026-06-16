package org.scoula.app;

import org.scoula.config.ProjectConfig;
import org.scoula.domain.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    /*
    IOC(Inversion of Control) 제어의 역전
    1. 의존성 자동 주입(DI) -> 필요한 객체를 Spring이 주입햐줌.
    2. 낮은 결합도 -> 클래스간 강한 연결없이 유지보수하기 좋은 구조
    3. Bean 생명주기 관리 -> 싱글톤
     */
    public static void main(String[] args) {

//        Parrot p = new Parrot();
//        System.out.println("self : " + p);

//        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // 클래스
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p2 = context.getBean(Parrot.class); // Parrot.class 형태로 되어있는 Bean 가져오기
        System.out.println("p2 = " + p2);

        Parrot p3 = context.getBean(Parrot.class); // Parrot.class 형태로 되어있는 Bean 가져오기
        System.out.println("p3 = " + p3);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
