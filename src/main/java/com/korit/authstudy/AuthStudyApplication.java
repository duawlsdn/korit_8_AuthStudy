package com.korit.authstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthStudyApplication.class, args);
    }

}


/*
    IoC - 메소드나 객체의 호출을 사용자가 하는 것이 아닌, 외부에서 자동으로 하게끔 하는 것

    DI
        - "의존성 주입" 은 제어의 역행이 일어날 때 스프링이 내부에 있는 객체들간의 관계를 관리할 때 사용하는 기법이다.
        - 의존적인 객체를 직접 생성하거나 제어하는 것이 아니라, 특정 객체에 필요한 객체를 외부에서 결정해서 연결
*/