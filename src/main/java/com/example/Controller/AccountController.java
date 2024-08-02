// package com.example.Controller;

// //import com.ordereat.domain.request.LoginRequest;
// //import com.ordereat.domain.response.LoginResponse;
// //import com.ordereat.service.impl.AccountService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/accounts")
// public class AccountController {

//     @Autowired
//     private AccountService accountService;

//     @PostMapping("/login")
//     public LoginResponse login(@RequestBody LoginRequest loginRequest) {
//         return accountService.login(loginRequest);
//     }

//     @PostMapping("/register")
//     public void register(@RequestBody RegisterRequest registerRequest) {
//         accountService.register(registerRequest);
//     }

// }
