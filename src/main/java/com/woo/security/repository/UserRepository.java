package com.woo.security.repository;

import com.woo.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 생략 가능(자동으로 bean 등록)
public interface UserRepository extends JpaRepository<User, Integer> {
}
