package com.example.Domain.Request;

import com.example.Domain.Entities.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Account_User_Request {
    private String name;
    private String password;
    Users users;
}
