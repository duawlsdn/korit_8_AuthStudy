package com.korit.authstudy.service;

import com.korit.authstudy.domain.entity.Member;
import com.korit.authstudy.dto.MemberRegisterDto;
import com.korit.authstudy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
/*
    1. @ import
    @Service

    2. 함수 정의
    public void register() {
        return
    }

    3. DB에 전달하기 위해
    public void register() {
        Member member = new Member();
        member.setMemberName(dto.getUserName());
        member.setPassword(dto.getPassword());
        member.setName(dto.getName());
        member.setEmail(dto.getEmail());
        return
    }

    4. Repository 설계

    5. Service 호출 시 Repository 에 save
    memberRepository.save(member);
*/
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member register1 (MemberRegisterDto dto) {
        return memberRepository.save(dto.toEntity1());
    }
}
