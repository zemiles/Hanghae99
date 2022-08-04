package com.sparta.spring.repository;

import com.sparta.spring.model.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {
    @NotNull Optional<User> findById(@NotNull Long userid);
    Optional<User> findByNickname(String nickname);
}
