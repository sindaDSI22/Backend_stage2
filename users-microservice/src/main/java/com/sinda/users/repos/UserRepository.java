package com.sinda.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sinda.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}