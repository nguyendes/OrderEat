package com.example.Service;

import com.example.Domain.Request.Menu_Store_Request;
import com.example.Domain.Response.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public interface StoreService {
    ApiResponse getStores();

    boolean addMenu(int id , Menu_Store_Request menu);
    ApiResponse getMenu(int id);
}
