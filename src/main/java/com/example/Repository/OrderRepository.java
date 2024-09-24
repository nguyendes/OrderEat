package com.example.Repository;

import com.example.Common.Status;
import com.example.Domain.Entities.Drivers;
import com.example.Domain.Entities.Orders;
import com.example.Domain.Entities.Stores;
import com.example.Domain.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findByStatus(Status status);
    List<Orders> findByStatusAndStores(Status status, Stores store);
    List<Orders> findByStatusAndDrivers(Status status, Drivers drivers);
    List<Orders> findByUsers(Users users);
}
