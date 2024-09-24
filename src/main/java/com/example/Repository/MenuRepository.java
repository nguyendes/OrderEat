package com.example.Repository;

import com.example.Domain.Entities.Menu;
import com.example.Domain.Entities.Stores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    List<Menu> findByStores(Stores store);
}
