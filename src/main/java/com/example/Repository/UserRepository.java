package com.example.Repository;

import com.example.Domain.Entities.Account;
import com.example.Domain.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByAccount(Account account);
}
