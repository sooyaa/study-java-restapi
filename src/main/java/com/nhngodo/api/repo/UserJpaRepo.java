package com.nhngodo.api.repo;



import com.nhngodo.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//public interface UserJpaRepo extends JpaRepository<User, Long> {}

public interface UserJpaRepo extends JpaRepository<User, Integer> {
    //Optional<User> findByUid(String email);
    Optional<User> findByUid(String email);
}