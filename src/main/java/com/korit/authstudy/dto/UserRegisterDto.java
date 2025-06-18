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
                // passwordEncoder.encode() 같은 경우 passwordEncoder를 config 에서 @Bean 으로 등록을 하고
                // service 에서 @RequiredArgsConstructor 로 매개변수로 사용되고
                // return 되는 dto.toEntity()에 매개변수로 passwordEncoder 를 넣어야지만
                // Dto 내에서 아래와 같이 정의하고 사용가능!
                .password(passwordEncoder.encode(password))
                .fullName(fullName)
                .email(email)
                .build();
    }
}
