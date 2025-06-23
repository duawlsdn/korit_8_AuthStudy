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

    삽입되는 형태
    GET = 쿼리스트링
    POST = JSON
    PUT = JSON

    Entity = DB와 연결할때 일치한 항목을 정의 및 명시
    DTO = DTO 내 toEntity() 정의 시에는 Frontend 에서 받아오는 변수명을 DB에 명시된 컬럼명과 일치를 시켜야 함.
        그 과정에서 이하 코드 처럼 작성됨.

        // frontend 의 data 내의 key
        private String username;
        private String password;
        private String fullName;
        private String email;

        public Member toEntity1() {
        return Member.builder()
                .memberName(username)
                .password(password)
                .name(fullName)
                .email(email)
                .build();
        }


    진행 흐름     Front => Back(Controller ->  Service -> Repository) => DB
    데이터 가공                            dto       Entity
    dto = 프론트와 백 데이터명 일치,  Entity = 해당 테이블 컬럼과 일치



    강사 진행도
    1. DB 설계 후 바로 Entity 설계
    2. Dto 기초 설계
    3. Controller 설계
    4. Dto 설계
    5. Service 설계
    6. Repository 설계

    파악실패
*/