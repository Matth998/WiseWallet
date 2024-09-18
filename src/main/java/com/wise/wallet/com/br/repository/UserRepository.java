package com.wise.wallet.com.br.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wise.wallet.com.br.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

