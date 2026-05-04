package com.example.Repositories;

import com.example.Domain.User.User; // Assuming User is in com.example.Domain.User
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
