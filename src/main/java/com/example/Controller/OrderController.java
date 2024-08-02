// package com.example.Controller;

// //import com.ordereat.domain.request.OrderRequest;
// //import com.ordereat.domain.response.OrderResponse;
// //import com.ordereat.service.impl.OrderService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/orders")
// public class OrderController {

//     @Autowired
//     private OrderService orderService;

//     @PostMapping("/place")
//     public OrderResponse placeOrder(@RequestBody OrderRequest orderRequest) {
//         return orderService.placeOrder(orderRequest);
//     }

//     @GetMapping("/{orderId}")
//     public OrderResponse getOrder(@PathVariable Long orderId) {
//         return orderService.getOrderById(orderId);
//     }

//     @GetMapping("/user/{userId}")
//     public List<OrderResponse> getOrdersByUser(@PathVariable Long userId) {
//         return orderService.getOrdersByUser(userId);
//     }

//     @GetMapping("/store/{storeId}")
//     public List<OrderResponse> getOrdersByStore(@PathVariable Long storeId) {
//         return orderService.getOrdersByStore(storeId);
//     }

//     // Các endpoint khác (e.g., update order status, cancel order, etc.)
// }
