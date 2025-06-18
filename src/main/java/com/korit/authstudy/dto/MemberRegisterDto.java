package com.korit.authstudy.dto;

import com.korit.authstudy.domain.entity.Member;
import lombok.Data;

/*
    1. Front 와 같은 자료명 기입
    private String username;
    private String password;
    private String fullName;
    private String email;

    2. @ import
    @ToString = 자료출력을 위해
    @Setter = 접근지정자가 private 이기 때문에 값을 넣기 위해
    @Getter = Service에서 값을 불러오기 위해
    => 상위 @ 를 합쳐서 @Data
*/
@Data
public class MemberRegisterDto {

    // Dto 같은 경우 vscode 에서 workbench 와 동일한 컬럼 명을 지정을하고
    private String username;
    private String password;
    private String fullName;
    private String email;

    // Entity 로 변환을 할 때에는 builder의 내 요소의 매개변수로 Dto에 선언된 변수들을 넣는다.
    // 그 결과 members_tb에 들어갈 컬럼명과 vscode 의 변수명을 일치시켜 workbench(DB)에 넣게 된다.
    // vscode(name: "username")
    // => intellij(Entity : private String memberName) DB와 일치
    // => intellij(Dto : .memberName(username) ) vscode 에서 받아오는 변수명 일치

    public Member toEntity1() {
        return Member.builder()
                .memberName(username)
                .password(password)
                .name(fullName)
                .email(email)
                .build();
    }
}
