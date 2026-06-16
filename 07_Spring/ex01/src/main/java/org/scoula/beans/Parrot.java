package org.scoula.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
//    private String name;

    public String name = "등록된 Bean의 이름";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
