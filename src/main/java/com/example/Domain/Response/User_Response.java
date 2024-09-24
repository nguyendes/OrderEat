package com.example.Domain.Response;


import com.example.Domain.Entities.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User_Response {
    private int id;
    private String name;
    private String phone;
    private String address;

    public User_Response(Users user) {
        this.id = user.getId();
        this.name = user.getName();
        this.phone = user.getPhone();
        this.address = user.getAddress();
    }
}
