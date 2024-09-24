package com.example.Repository;

import com.example.Domain.Entities.Account;
import com.example.Domain.Entities.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Drivers, Integer> {
    Drivers findByAccount(Account account);
    Drivers findById(int id);
}
