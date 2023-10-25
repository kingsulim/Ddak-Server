package com.sulim.ddak.infrastructure.persistence;

import com.sulim.ddak.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
