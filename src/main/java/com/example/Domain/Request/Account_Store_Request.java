package com.example.Domain.Request;

import com.example.Domain.Entities.Stores;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Account_Store_Request {
    private String name;
    private String password;
    Stores stores;
}
