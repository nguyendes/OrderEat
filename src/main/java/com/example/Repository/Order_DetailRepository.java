package com.example.Repository;

import com.example.Domain.Entities.Menu;
import com.example.Domain.Entities.Order_Details;
import com.example.Domain.Entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Order_DetailRepository extends JpaRepository<Order_Details, Integer> {

    @Query("SELECT m FROM Order_Details u JOIN u.menu m WHERE u.orders = :orders")
    List<Menu> findByOrders(@Param("orders") Orders orders);
}
