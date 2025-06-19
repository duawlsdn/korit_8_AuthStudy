package com.korit.authstudy.dto;




import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JwtDto {
    private String accessToken;

//    https://jwtsecrets.com/
//    jwt secrets 생성 사이트
}
