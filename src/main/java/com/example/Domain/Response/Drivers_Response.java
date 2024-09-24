package com.example.Domain.Response;

import com.example.Domain.Entities.Drivers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Drivers_Response {

    private int id;
    private String name;
    private String phone;

    public Drivers_Response(Drivers drivers) {
        this.id = drivers.getId();
        this.name = drivers.getName();
        this.phone = drivers.getPhone();
    }
}