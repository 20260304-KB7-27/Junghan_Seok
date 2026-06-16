package org.scoula.app;

import org.scoula.beans.Person;
import org.scoula.config.ProjectConfig2;
import org.scoula.domain.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    /*
    어노테이션 DI 방식 - Setter 주입
    - setter 매서드 위에 @Autowired 작성
    - 객체가 생성된 이후 주입됨.
     */
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        Person person = context.getBean(Person.class);

        System.out.println("person의 이름 = " + person);
        System.out.println("person = " + person);

//        Parrot p = context.getBean("miki", Parrot.class);
//        System.out.println(p.getName());
    }
}
