package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정 파일로 스프링 프레임워크에 알려주는 역할
public class ProjectConfig {
    @Bean // 스프링에 싱글톤 Bean 등록을 해야한다고 알려주는 어노테이션
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Bean 등록된 Parrot");
        p.setName("Koko");
        return p;
    }

    @Bean
        // @Bean보다는 컴포넌트 스캔을 주로 사용하고
        // @Bean은 외부 라이브러리(ComponentScan을 할 수 업는 경우)
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
