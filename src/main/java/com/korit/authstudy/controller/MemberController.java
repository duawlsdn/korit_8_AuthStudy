package com.korit.authstudy.controller;

import com.korit.authstudy.dto.MemberRegisterDto;
import com.korit.authstudy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
    1. @ import
    @RestController

    2. 함수 정의
    public ResponseEntity<?> registerMember () {
        return ResponseEntity.ok();
    }

    3. 함수 정의 PostMapping
    @PostMapping
    public ResponseEntity<?> registerMember () {
        return ResponseEntity.ok(null); => 값이 무조건 있어야 하기에 초기 null 설정
    }

    4. 함수 매개변수 & @ 정의
    @PostMapping
    public ResponseEntity<?> registerMember (@RequestBody MemberRegisterDto dto) {
        return ResponseEntity.ok(null);
    }

    5. service를 호출
    MemberService memberService = new MemberService();
    memberService.register();
    => 코드의 반복성이 늘어남에 주소할당을 반복하기에 부적합 하여 리팩토링

    전역으로 선언
    @RequiredArgsConstructor (클래스 레벨에 @ import)
    private final MemberService memberService;
*/
@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<?> registerMember (@RequestBody MemberRegisterDto dto) {
        return ResponseEntity.ok(memberService.register1(dto));
    }
}
