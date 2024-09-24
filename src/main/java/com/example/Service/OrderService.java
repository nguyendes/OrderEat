package com.example.Service;

import com.example.Common.Status;

import com.example.Domain.Request.Order_Request;
import com.example.Domain.Request.Status_Request;
import com.example.Domain.Response.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    boolean addOrder(Order_Request order);
    boolean updateOrder(Order_Request order);
    boolean changeStatus(int id, Status_Request status);
    ApiResponse getOrderByStatus(Status_Request status);
    ApiResponse getOrderByStatusOfStore(Status_Request status, int id);
    ApiResponse getOrderByStatusOfShipper(Status_Request status, int id);
    ApiResponse getOrderOfUser(int id);
}