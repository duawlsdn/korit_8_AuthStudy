package com.korit.authstudy.repository;

import com.korit.authstudy.domain.entity.User;
import jakarta.transaction.Transactional;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> findByUsername(String username);

    // JPQL : jpa 전용 sql문 - 객체 중심(객체의 변수명)
    @Query( value = """
        update User
        set fullName = :#{#user.fullName}, email = :#{#user.email}
        where id = :#{#user.id}
        """)
    @Modifying(clearAutomatically = true)
    int updateFullNameOrEmailById(@Param("user") User user);

//    @Query("update User set fullName = :#{#user.fullName}, email = :#{#user.email} where id = :#{#user.id}")
//    @Transactional
//    @Modifying(clearAutomatically = true)
//    int updateFullNameOrEmailById(@Param("user") User user);
}
