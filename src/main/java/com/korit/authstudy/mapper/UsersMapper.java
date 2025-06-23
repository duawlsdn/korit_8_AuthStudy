package com.korit.authstudy.mapper;

import com.korit.authstudy.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper {

    // 추상 메소드 정의
    public int updateFullNameOrEmailById(User user);
    public int updatePassword(@Param("id") Integer userId, @Param("password") String newPassword);
}
