package com.javatodev.finance.repository;

import com.javatodev.finance.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

    public interface UserRepository extends JpaRepository<User, Long> {
        Optional<User> findByIdentificationNumber(String identificationNumber);
    }

