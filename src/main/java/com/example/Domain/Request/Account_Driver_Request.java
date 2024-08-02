package com.example.Domain.Request;

import com.example.Domain.Entities.Drivers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Account_Driver_Request {
    private String name;
    private String password;
    Drivers drivers;
}
