
package com.example.Controller;

import com.example.Domain.Request.Order_Request;
import com.example.Domain.Request.Status_Request;
import com.example.Domain.Response.ApiResponse;
import com.example.Service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
@AllArgsConstructor
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public boolean createOrder(@RequestBody Order_Request order) {
        boolean check = orderService.addOrder(order);
        return check;
    }
    @PutMapping
    public boolean UpdateOrder(@RequestBody Order_Request order) {
        boolean check = orderService.updateOrder(order);
        return check;
    }
    @GetMapping("status")
    public ApiResponse getAllOrdersByStatus(@RequestBody Status_Request status) {
        ApiResponse apiResponse = orderService.getOrderByStatus(status);
        return apiResponse;
    }
    @GetMapping("OrderOfStore")
    public ApiResponse getAllOrdersByStatusOfStore(
            @RequestBody Status_Request status,
            @RequestBody int id_Store
    ) {
        ApiResponse apiResponse = orderService.getOrderByStatusOfStore(status,id_Store);
        return apiResponse;
    }
    @GetMapping("OrderOfShipper")
    public ApiResponse getAllOrdersByStatuOfShipper(
            @RequestBody Status_Request status,
            @RequestBody int id_Shipper) {
        ApiResponse apiResponse = orderService.getOrderByStatusOfShipper(status,id_Shipper);
        return apiResponse;
    }
    @GetMapping("OrderOfUser")
    public ApiResponse getAllOrdersOfUser(@RequestBody int id_user) {
        ApiResponse apiResponse = orderService.getOrderOfUser(id_user);
        return apiResponse;
    }
    @GetMapping("status/{id}")
    public boolean getAllOrdersByStatus(@PathVariable int id, @RequestBody Status_Request status) {
        boolean check = orderService.changeStatus(id,status);
        return check;
    }
}
