package com.devBangs.springboot.web.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    //소셜 로그인으로 반환되는 값중 email을 통해 이미 생성된자인지 판단
    Optional<User> findByEmail(String email);

}