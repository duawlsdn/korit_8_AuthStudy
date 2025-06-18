package com.korit.authstudy.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    강사님 진행도

    1. @ import
    @Entity
    @Table(name = "member_tb")

    2. 변수 선언
    private Integer id;
    private String memberName;
    private String password;
    private String name;
    private String email;

    3. @ import
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")

    4. get, set를 위해서 @ import
    @Builder
    하지만 @Builder 를 위해선 @NoArgs @AllArgs 가 필요
*/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "members_tb")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Integer id;

    private String memberName;
    private String password;
    private String name;
    private String email;


}
