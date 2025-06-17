package com.korit.authstudy.dto;

import com.korit.authstudy.domain.entity.User;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
public class UserRegisterDto {

    private String username;
    private String password;
    private String fullName;
    private String email;

    // UserRegisterDto 를 Entity 객체로 변환
    public User toEntity (BCryptPasswordEncoder passwordEncoder) {
        return User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .fullName(fullName)
                .email(email)
                .build();
    }
}
