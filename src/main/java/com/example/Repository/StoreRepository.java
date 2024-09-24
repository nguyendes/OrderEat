package com.example.Repository;

import com.example.Domain.Entities.Account;
import com.example.Domain.Entities.Stores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Stores, Integer> {
    Stores findByAccount(Account account);
}
